/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.negocio.impl;

import co.edu.semillero.colegioquipux.datos.AsignacionDatos;
import co.edu.semillero.colegioquipux.dtos.AsignacionDTO;
import co.edu.semillero.colegioquipux.dtos.EstudianteDTO;
import co.edu.semillero.colegioquipux.dtos.MateriaDTO;
import co.edu.semillero.colegioquipux.negocio.AsignacionNegocio;
import co.edu.semillero.colegioquipux.negocio.EstudianteNegocio;
import co.edu.semillero.colegioquipux.negocio.MateriaNegocio;
import java.util.List;

/**
 *
 * @author Gris
 */
public class AsignacionNegocioImpl implements AsignacionNegocio{

    AsignacionDatos asignacionDatos = new AsignacionDatos();
    EstudianteNegocio estudianteNegocio = new EstudianteNegocioImpl();
    MateriaNegocio materiaNegocio = new MateriaNegocioImpl();
    @Override
    public void asignar() {
        List<EstudianteDTO> listaEstudiantes = estudianteNegocio.consultar();
        List<MateriaDTO> listaMaterias = materiaNegocio.consultar();
        AsignacionDTO asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(0));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
        asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(1));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
        asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(2));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
    }

    @Override
    public List<AsignacionDTO> cosultar() {
        return asignacionDatos.consultar();
    }
    
    
    
}

