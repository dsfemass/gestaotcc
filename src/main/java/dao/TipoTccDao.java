package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.TipoTcc;

/**
 *
 * @author jhona
 */

@Stateless
public class TipoTccDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public void incluir(TipoTcc tipo){
        em.persist(tipo);
    }
    
    public void alterar(TipoTcc tipo){
        em.merge(tipo);
    }
    
    public void delete(TipoTcc tipo){
        em.remove(tipo);
    }
    
    public List<TipoTcc> getTipoTcc(){
        Query q = em.createQuery("select t from TipoTcc t order by t.numero");
        return q.getResultList();
    }
    
}
