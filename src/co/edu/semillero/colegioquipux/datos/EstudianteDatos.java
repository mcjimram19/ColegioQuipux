/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.datos;

import co.edu.semillero.colegioquipux.dtos.EstudianteDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gris
 */
public class EstudianteDatos {
     public static ArrayList<EstudianteDTO> listaEstudiantes = new ArrayList<EstudianteDTO>();
    
    public void registrar(EstudianteDTO estudianteDTO){
        listaEstudiantes.add(estudianteDTO);
    }
    
    public List<EstudianteDTO> consultar(){
        return listaEstudiantes;
    }
}
