/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.semillero.colegioquipux.datos;

import co.edu.semillero.colegioquipux.dtos.UsuarioDTO;
import java.util.ArrayList;

// Clase LoginUsuario
 
public class LoginDatos_prototipo {

    public static void existeUsuario(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
   private ArrayList<UsuarioDTO> ListaUsuario  = new ArrayList<UsuarioDTO>();
  
 
 
 
//Crea la lista de usuarios
 
   public LoginDatos_prototipo(ArrayList<UsuarioDTO> ListaUsuario) {
        this.ListaUsuario = ListaUsuario;
    }
 
  public LoginDatos_prototipo() {
    }
   
 
//Devuelve la lista de usuarios
    public ArrayList<UsuarioDTO> getListaUsuario() {
        return ListaUsuario;
    }
 
 //Asigna la lista de usuarios
 
  public void setListaUsuario(ArrayList<UsuarioDTO> ListaUsuario) {
        this.ListaUsuario = ListaUsuario;
}
 

 
 public boolean  registrarUsuario(UsuarioDTO U) {
        boolean registro = false;
        try {
             this.ListaUsuario.add(U);  //Verificar this 
              registro = true;}
 catch (Exception e){
e.printStackTrace();
  }
        
        
return registro;
    }
 public void IncluirUsuario(UsuarioDTO us) {
        this.ListaUsuario.add(us);
}
 public boolean existeUsuario(String nom_us, String cl_us){

        boolean saber=false;
 
        for(int i=0; i<= ListaUsuario.size(); i++){
            if ((ListaUsuario.get(i).getUsuario().equals(nom_us)) && 
                    ((ListaUsuario.get(i).getClave().equals(cl_us))));{
                saber=true;
                break;
            }
        }
        return saber;
}






 
   public void imprimir (){
          if (ListaUsuario != null) {
            for (UsuarioDTO us : ListaUsuario) {
                System.out.println("---------------");
                System.out.println(us.getNombres());
                System.out.println(us.getApellidos());
                System.out.println(us.getUsuario());
                System.out.println(us.getClave());

                }
            }
       
    }
   public void Imprimir2() {
if (ListaUsuario != null) {
for(int i=0; i<= ListaUsuario.size(); i++){
System.out.println ("Usuario : " + i + " :  " + ListaUsuario.get(i).getNombres() + " ,  " +  ListaUsuario.get(i).getApellidos() + " ,  " + ListaUsuario.get(i).getUsuario() + " ,  " + ListaUsuario.get(i).getClave());
}
}
}

    public void imprimir2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}  
//public String consultarClaveUsuario(String usuario) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

    //public void Imprimir() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//}


