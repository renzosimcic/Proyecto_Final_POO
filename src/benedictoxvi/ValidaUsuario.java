
package benedictoxvi;

import java.util.ArrayList;


public class ValidaUsuario {
    private ArrayList<Usuario> usuarios;
    
    public ValidaUsuario(){
        
    usuarios = new ArrayList<Usuario>();
    
}
    
    private void validarDatos(String Nombre, String ApellidoPaterno, 
            String ApellidMaterno, String email, String dni, String telefono, 
            String usuario, String contrasenha) throws BusinessException{
        
             String mensaje = "";
             
        if (Nombre==null || Nombre.isEmpty())
            mensaje += "\nNombre no puede ser nulo o vacio";
        if (ApellidoPaterno==null || ApellidoPaterno.isEmpty())
            mensaje += "\nApellido Paterno no puede ser nulo o vacio";
        if (ApellidMaterno==null || ApellidMaterno.isEmpty())
            mensaje += "\nApellido Materno no puede ser nulo o vacio";
        if (email==null || email.isEmpty())
            mensaje += "\nEmail no puede ser nulo o vacio";
        if (dni==null || dni.isEmpty())
            mensaje += "\ndni no puede ser nulo o vacio";
        if (telefono==null || telefono.isEmpty())
            mensaje += "\nTelefono no puede ser nulo o vacio";
        if (usuario==null || usuario.isEmpty())
            mensaje += "\nUsuario no puede ser nulo o vacio";
        if (contrasenha==null || contrasenha.isEmpty())
            mensaje += "\nContraseña no puede ser nulo o vacio";
        
    }
    
    public void registrarUsuario(String Nombre, String ApellidoPaterno, 
            String ApellidMaterno, String email, String dni, String telefono, 
            String usuario, String contrasenha) throws BusinessException{
        
        validarDatos(Nombre, ApellidoPaterno, ApellidMaterno, email, dni, telefono, usuario, contrasenha);
        
        Usuario nuevo = new Usuario(Nombre, ApellidoPaterno, ApellidMaterno, email, dni, telefono, usuario, contrasenha);
        usuarios.add(nuevo);
        
    }
    
    public int getCantidadUsuario(){
        return usuarios.size();
    }
    
    public String validarUsuario(String user,String pass){
        
        String mensaje = "";
        
        for(Usuario usuario : usuarios)
            
                        
            if(usuario.getUsuario().equals(user)){
                if(usuario.getContrasenha().equals(pass)){
        
                    mensaje = "Usuario valido";
                    
                }
                else{ mensaje = "Usuario no valido"; }   
                
            }else{mensaje = "Usuario no existe";} 
                    
        
        return mensaje;
        
        
        
    }
    
    public void listarDatos(){
        
        for(Usuario usuario : usuarios)
        
         System.out.println(" " + usuario.getNombre() +
                  "\t" + usuario.getApellidoPaterno() +
                 "\t" + usuario.getApellidMaterno() +
                 "\t" + usuario.getDni() +
                 "\t" + usuario.getEmail() +
                 "\t" + usuario.getTelefono() +
                 "\t" + usuario.getUsuario() );
    }
    
    
    
    
    
}
