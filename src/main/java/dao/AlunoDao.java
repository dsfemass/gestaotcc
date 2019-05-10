package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Aluno;

/**
 *
 * @author jhona
 */
@Stateless
public class AlunoDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public void incluir(Aluno aluno){
        em.persist(aluno);
    }
    
    public void alterar(Aluno aluno){
        em.merge(aluno);
    }
    
    public void delete(Aluno aluno){
        em.remove(aluno);
    }
    
    public List<Aluno> getAlunos(){
        Query q = em.createQuery("select a from Aluno a order by a.nome");
        return q.getResultList();
    }  
}
