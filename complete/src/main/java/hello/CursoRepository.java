/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import hello.Model.Aluno;
import hello.Model.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Ismae
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{
    @Query(value="SELECT d.`NomeMateria` , d.sala FROM aluno a, curso c, disciplinas d, materia_curso mc where c.`IDCurso` = a.`FKCurso` and a.`FKCurso` = mc.`FKCurso` and d.`IdMateria` = mc.`FKMateria` and matricula = ?1",nativeQuery = true)
   List<Object> findNomeCurso(String matricula);
}
