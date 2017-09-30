/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.colegioquipux.validacion;
import co.edu.semillero.colegioquipux.dtos.LoginUsuarioDTO;
import co.edu.semillero.colegioquipux.negocio.impl.LoginNegocioImpl;
import javax.swing.JOptionPane;
/**
 *
 * @author Maria Camila
 */
public class LoginValidacion {
    public boolean login(LoginUsuarioDTO loginUsuario) {
       if(loginUsuario.getUsuario().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso usuario");
           return false;
       }
       if (loginUsuario.getPassword().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso contraseña");
           return false;
       }
LoginNegocioImpl loginNegocio=new LoginNegocioImpl();
return loginNegocio.login(loginUsuario);
    }
   
    public boolean login(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
