/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ismae
 */
@Entity
@Table(name = "curso")
public class Curso implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCurso")
    private Integer iDCurso;
    @Column(name="nomeCurso")
    private String nomeCurso;

    public Curso() {
    }

    public Curso(Integer iDCurso) {
        this.iDCurso = iDCurso;
    }

    public Curso(Integer iDCurso, String nomeCurso) {
        this.iDCurso = iDCurso;
        this.nomeCurso = nomeCurso;
    }

    public Integer getIDCurso() {
        return iDCurso;
    }

    public void setIDCurso(Integer iDCurso) {
        this.iDCurso = iDCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
       this.nomeCurso = nomeCurso;
   }


   

   
    
    
}
