package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Curso;

/**
 *
 * @author jhona
 */

@Stateless
public class CursoDao {
    
    @PersistenceContext
    EntityManager em;
    
    public void incluir(Curso curso){
        em.persist(curso);
    }
    
    public void alterar(Curso curso){
        em.merge(curso);
    }
    
    public void delete(Curso curso){
        em.remove(curso);
    }
    
    public List<Curso> getCursos(){
        Query q = em.createQuery("select c from Curso c order by c.nome");
        return q.getResultList();
    }  
}
