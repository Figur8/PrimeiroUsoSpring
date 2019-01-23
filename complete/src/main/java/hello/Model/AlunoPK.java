/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Ismae
 */
@Embeddable
public class AlunoPK implements Serializable {

    @Column(name = "FKCurso")
    private int fKCurso;
    @Column(name = "idAluno")
    private int idAluno;

    public AlunoPK() {
    }

    public AlunoPK(int fKCurso, int idAluno) {
        this.fKCurso = fKCurso;
        this.idAluno = idAluno;
    }

    public int getFKCurso() {
        return fKCurso;
    }

    public void setFKCurso(int fKCurso) {
        this.fKCurso = fKCurso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fKCurso;
        hash += (int) idAluno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlunoPK)) {
            return false;
        }
        AlunoPK other = (AlunoPK) object;
        if (this.fKCurso != other.fKCurso) {
            return false;
        }
        if (this.idAluno != other.idAluno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.Model.AlunoPK[ fKCurso=" + fKCurso + ", idAluno=" + idAluno + " ]";
    }
    
}
