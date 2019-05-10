/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProfessorDao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.Professor;

/**
 *
 * @author jhona
 */
@Named(value = "guiTermoCompromisso")
@SessionScoped
public class GuiTermoCompromisso implements Serializable {
    
    List<Professor> professores;
    
    @EJB
    ProfessorDao professorDao;
    /**
     * Creates a new instance of GuiTermoCompromisso
     */
    public GuiTermoCompromisso() {
    }
    
    public String iniciarLista(){
        professores = professorDao.getProfessores();
        return "frmTermoCompromisso";
    }
    public String gravarTermo(){
        return "home";
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    
    
}
