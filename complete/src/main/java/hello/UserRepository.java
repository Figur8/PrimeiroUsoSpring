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
//    @Query(value="SELECT aluno FROM aluno WHERE matricula = ?1")
//    List<Aluno> findBy(String id);
    
}
