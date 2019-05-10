package gui;

import dao.UsuarioDao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.Usuario;

/**
 *
 * @author jhona
 */
@Named(value = "guiLogin")
@SessionScoped
public class GuiLogin implements Serializable {
    private String matricula;
    private String senha;
    
    @EJB
    UsuarioDao usuarioDao;
    
    /**
     * Creates a new instance of GuiLogin
     */
    public GuiLogin() {
    }
    
    
    public String logar(){
        List<Usuario> usuarios = usuarioDao.getUsuarios();
        
        for(Usuario user : usuarios){     
            if(user.getLogin().contentEquals(matricula) && user.getSenha().contentEquals(senha)){
                return "home";
            }
        }
        System.out.println("Erro na autentificação desse usuário");
        return null;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    
    
    
}
