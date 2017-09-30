/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio.impl;

import co.edu.semillero.colegioquipux.datos.EstudianteDatos;
import co.edu.semillero.colegioquipux.dtos.EstudianteDTO;
import co.edu.semillero.colegioquipux.negocio.EstudianteNegocio;
import java.util.List;

/**
 *
 * @author Gris
 */
public class EstudianteNegocioImpl implements EstudianteNegocio{

    EstudianteDatos estudianteDatos = new EstudianteDatos();
    
    /**
     *
     * @param estudiante
     */
    @Override
    public void registrar(EstudianteDTO estudiante) {
        estudianteDatos.registrar(estudiante);
    }
    
    @Override
    public List<EstudianteDTO> consultar(){
        return estudianteDatos.consultar();
    }
    
}

