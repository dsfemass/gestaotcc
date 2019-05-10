/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author jhona
 */
@Named(value = "guiMain")
@SessionScoped
public class GuiMain implements Serializable {

    /**
     * Creates a new instance of GuiMain
     */
    public GuiMain() {
    }
    
    
    public String deslogar(){
        System.out.println("Deslogado");
        return "index";
    }
    
}
