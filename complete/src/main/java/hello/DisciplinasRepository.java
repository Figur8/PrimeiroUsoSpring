/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import hello.Model.Disciplinas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ismae
 */
//Essa parte tá ok
@Repository
public interface DisciplinasRepository extends JpaRepository<Disciplinas, Integer>{
    @Query(value= "SELECT * FROM disciplinas WHERE idmateria = (SELECT curso.idCurso FROM curso INNER JOIN aluno on curso.idcurso = ?1 )", nativeQuery = true)
    List<Disciplinas> findAllAtivas(String idMateria);
    
    
}
