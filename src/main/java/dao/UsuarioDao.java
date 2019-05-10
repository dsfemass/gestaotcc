package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Usuario;

/**
 *
 * @author jhona
 */

@Stateless
public class UsuarioDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public void incluir(Usuario usuario){
        em.persist(usuario);
    }
    
    public void alterar(Usuario usuario){
        em.merge(usuario);
    }
    
    public void delete(Usuario usuario){
        em.remove(usuario);
    }
    
    public List<Usuario> getUsuarios(){
        Query q = em.createQuery("select u from Usuario u order by u.login");
        return q.getResultList();
    }  
}
