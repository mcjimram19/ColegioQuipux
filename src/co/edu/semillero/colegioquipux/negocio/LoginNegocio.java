/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio;

import co.edu.semillero.colegioquipux.dtos.LoginUsuarioDTO;

/**
 *
 * @author Gris
 */
public interface LoginNegocio {
    
    public boolean login(LoginUsuarioDTO loginUsuario);
    
}

