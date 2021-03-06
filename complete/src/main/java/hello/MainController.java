package hello;

import hello.Model.Aluno;
import hello.Model.Disciplinas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.Model.Curso;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController    // This means that this class is a Controller
@CrossOrigin
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;
    @Autowired
    private CursoRepository cursoRepository;
    
    @Autowired
    private DisciplinasRepository disciplinasRepository;
    
    
    Aluno aluno = new Aluno();
    
     @GetMapping(path = "/nomeCurso")
    public @ResponseBody
    List<Object> getAllNomeCurso(@RequestParam String matricula) {
        // This returns a JSON or XML with the users
        aluno.setMatricula(matricula);
        List<Object> cursos = cursoRepository.findNomeCurso(matricula);
        return cursos;
        //return cursoRepository.findNomeCurso(aluno.getMatricula());
    }    
    
    @GetMapping(path = "/aluno")
    public @ResponseBody
    Iterable<Aluno> getAllAlunos(@RequestParam String matricula) {
        // This returns a JSON or XML with the users
        aluno.setMatricula(matricula);
        return userRepository.findMatricula(aluno.getMatricula());
    }    
    
    @GetMapping(path = "/curso")
    public @ResponseBody
    Iterable<Curso> getAllCurso(){
        return cursoRepository.findAll();
    }
    
    @GetMapping(path = "/disciplinas")
    public @ResponseBody
    Iterable<Disciplinas> getAllDisciplinas(){
        return disciplinasRepository.findAll();
    }
    
    @GetMapping(path = "/sala")
    public @ResponseBody
    Iterable<Disciplinas> getSalaDisciplina(){
        return disciplinasRepository.findAllAtivas(aluno.getMatricula());
    }
    
    
    @GetMapping(path= "/teste")
    public @ResponseBody
    Iterable<Disciplinas> reconhecer(@RequestParam String matricula){
        aluno.setMatricula(matricula);
        return disciplinasRepository.findAllAtivas(aluno.getMatricula());
    }
//    @CrossOrigin
//    @GetMapping(path = "/add") // Map ONLY GET Requests
//    public @ResponseBody
//    String addNewUser(@RequestParam String curso,
//            @RequestParam String email,
//            @RequestParam String nome,
//            @RequestParam String semestre,
//            @RequestParam String telefone,
//            @RequestParam String turno) {
//        Aluno aluno = new Aluno();
//        aluno.setCurso(curso);
//        aluno.setEmail(email);
//        aluno.setNome(nome);
//        aluno.setSemestre(semestre);
//        aluno.setTelefone(telefone);
//        aluno.setTurno(turno);
//        return "saved";
//    }

//    
//    @GetMapping(path = "/AlunoMatricula")
//    public @ResponseBody
//    List<Aluno> getAlunoByMatricula(){
//        return userRepository.findBy("17130210");
//    }
}
