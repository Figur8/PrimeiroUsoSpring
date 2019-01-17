/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import hello.CursoRepository;
import hello.Model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ismae
 */
@Controller    // This means that this class is a Controller
@CrossOrigin
@RequestMapping(path = "/curso")
public class CursoController {
     @Autowired
    private CursoRepository cursoRepository;
    
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }
}
