/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio.impl;

import co.edu.semillero.colegioquipux.datos.MateriaDatos;
import co.edu.semillero.colegioquipux.dtos.MateriaDTO;
import co.edu.semillero.colegioquipux.negocio.MateriaNegocio;
import java.util.List;

/**
 *
 * @author Gris
 */
public class MateriaNegocioImpl implements MateriaNegocio{

    MateriaDatos materiaDatos = new MateriaDatos();
    
    @Override
    public void crearMaterias() {
        materiaDatos.crear();
    }

    /**
     *
     * @return
     */
    @Override
    public List<MateriaDTO> consultar() {
        return materiaDatos.consultar();
    }
    
}

