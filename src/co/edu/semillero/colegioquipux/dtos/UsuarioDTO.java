/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.colegioquipux.dtos;

/**
 *
 * @author Gris
 */
public class UsuarioDTO {

    private  String NOMBRES;
    private String APELLIDOS;
    private String USUARIO;
    private String CLAVE;

    
    public UsuarioDTO(String nombres, String apellidos, String clave, String Usuario)
    {   
        this.NOMBRES = nombres;
        this.APELLIDOS= apellidos;
        this.CLAVE=clave;
        this.USUARIO=Usuario;
    }

    public UsuarioDTO() {
       
    }
     public String getNombres() {
        return NOMBRES;
    }
 
    public void setNombres(String nombres){
        this.NOMBRES= nombres;
    }
 
 
 
 
 
    public String getApellidos() {
        return APELLIDOS;
    }
    public void setApellidos(String apellidos){
        this.APELLIDOS= apellidos;
    }
 
 
 

    public String getClave() {
        return  CLAVE;
    }
    public void setClave(String clave){
        this.CLAVE= clave;
    }
 
 
 
    public String getUsuario() {
        return  USUARIO;
    }
 
    public void setUsuario(String usuario){
        this.USUARIO= usuario;
    }

    

public void Imprimir (){
      
                System.out.println("---------------");
                System.out.println(this.getNombres());
                System.out.println(this.getApellidos());
                System.out.println(this.getUsuario());
                System.out.println(this.getClave());

                }

    public void Imprimir2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                }
    


    