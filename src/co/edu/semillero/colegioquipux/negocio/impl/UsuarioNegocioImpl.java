/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio.impl;

import co.edu.semillero.colegioquipux.datos.LoginDatos;
import co.edu.semillero.colegioquipux.dtos.UsuarioDTO;
import co.edu.semillero.colegioquipux.negocio.UsuarioNegocio;

/**
 *
 * @author Gris
 */
public class UsuarioNegocioImpl implements UsuarioNegocio{
    
    private LoginDatos loginDatos;
    
    /**
     *
     * @param usuarioDTO
     * @return
     */
    @Override
    public boolean registrar(UsuarioDTO usuarioDTO){
        loginDatos = new LoginDatos();
        return loginDatos.registrarUsuario(usuarioDTO);
       
    }
    
    
}