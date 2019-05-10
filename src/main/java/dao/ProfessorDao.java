/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Professor;

/**
 *
 * @author jhona
 */
@Stateless
public class ProfessorDao {
    
    @PersistenceContext
    EntityManager em;
    
    public void incluir(Professor professor){
        em.persist(professor);
    }
    
    public void alterar(Professor professor){
        em.merge(professor);
    }
    
    public void delete(Professor professor){
        em.remove(professor);
    }
    
    public List<Professor> getProfessores(){
        Query q = em.createQuery("select p from Professor p order by p.nome");
        return q.getResultList();
    }  
}
