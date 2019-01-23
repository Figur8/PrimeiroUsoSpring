/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    @Column(name = "NomeCurso")
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCurso != null ? iDCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.iDCurso == null && other.iDCurso != null) || (this.iDCurso != null && !this.iDCurso.equals(other.iDCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.Model.Curso[ iDCurso=" + iDCurso + " ]";
    }
    
}
