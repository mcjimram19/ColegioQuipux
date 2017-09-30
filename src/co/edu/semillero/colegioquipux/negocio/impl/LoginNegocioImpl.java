/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio.impl;

import co.edu.semillero.colegioquipux.datos.LoginDatos;
import co.edu.semillero.colegioquipux.dtos.LoginUsuarioDTO;
import co.edu.semillero.colegioquipux.negocio.LoginNegocio;

/**
 *
 * @author Gris
 */
public class LoginNegocioImpl implements LoginNegocio{
    @Override
    public boolean login(LoginUsuarioDTO loginUsuario){
        LoginDatos loginDatos=new LoginDatos();
        String claveBd=loginDatos.consultarClaveUsuario(loginUsuario.getUsuario());
        if(loginUsuario.getPassword().equals(claveBd)){
            return true;
        }
        return false;
    }
    
}