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
import model.Movimentacao;

/**
 *
 * @author jhona
 */
@Stateless
public class MovimentacaoDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public void incluir(Movimentacao movimentacao){
        em.persist(movimentacao);
    }
    
    public void alterar(Movimentacao movimentacao){
        em.merge(movimentacao);
    }
    
    public void delete(Movimentacao movimentacao){
        em.remove(movimentacao);
    }
    
    public List<Movimentacao> getMovimentacoes(){
        Query q = em.createQuery("select m from Movimentacao m order by m.data");
        return q.getResultList();
    }  
}
