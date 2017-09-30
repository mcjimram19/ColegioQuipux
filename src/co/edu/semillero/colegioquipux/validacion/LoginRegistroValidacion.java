/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.colegioquipux.validacion;


import co.edu.semillero.colegioquipux.dtos.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author VALERIA
 */
public class LoginRegistroValidacion {
    public boolean Registro(UsuarioDTO us) {

       
           
           if(us.getUsuario().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso usuario");
           return false;
       }
    
           
           if (us.getClave().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso contraseña");
           return false;
       }
           
           
           if (us.getNombres().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso No ingreso Nomnbres");
           return false;
       }
           
 
           
           if (us.getApellidos().equals("")) {
           JOptionPane.showMessageDialog(null, "No ingreso Apellidos");
           return false;
       }
        return true;
        
    }
   
}
    
    
