/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio;

import co.edu.semillero.colegioquipux.dtos.EstudianteDTO;
import java.util.List;

/**
 *
 * @author Gris
 */
public interface EstudianteNegocio {
    
    void registrar(EstudianteDTO estudiante);
    public List<EstudianteDTO> consultar();
}

