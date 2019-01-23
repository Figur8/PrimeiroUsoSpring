/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ismae
 */
@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected AlunoPK alunoPK;
    @Column(name = "Matricula")
    private String matricula;
    @Column(name = "Senha")
    private String senha;

    public Aluno() {
    }

    public Aluno(AlunoPK alunoPK) {
        this.alunoPK = alunoPK;
    }

    public Aluno(int fKCurso, int idAluno) {
        this.alunoPK = new AlunoPK(fKCurso, idAluno);
    }

    public AlunoPK getAlunoPK() {
        return alunoPK;
    }

    public void setAlunoPK(AlunoPK alunoPK) {
        this.alunoPK = alunoPK;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alunoPK != null ? alunoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.alunoPK == null && other.alunoPK != null) || (this.alunoPK != null && !this.alunoPK.equals(other.alunoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.Model.Aluno[ alunoPK=" + alunoPK + " ]";
    }
    
}
