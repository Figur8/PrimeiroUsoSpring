package hello;

import hello.Model.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<Aluno, Integer> {
   @Query(value="SELECT * FROM aluno a  INNER JOIN curso c ON a.matricula = ?1",nativeQuery = true)
   List<Aluno> findMatricula(String matricula);
    
}
