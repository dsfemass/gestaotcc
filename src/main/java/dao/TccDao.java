package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Tcc;

/**
 *
 * @author jhona
 */

@Stateless
public class TccDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public void incluir(Tcc tcc){
        em.persist(tcc);
    }
    
    public void alterar(Tcc tcc){
        em.merge(tcc);
    }
    
    public void delete(Tcc tcc){
        em.remove(tcc);
    }
    
    public List<Tcc> getTcc(){
        Query q = em.createQuery("SELECT t from Tcc t order by t.autor");
        return q.getResultList();
    }
    
}
