/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author renzo
 */
public class AltaProspecto {
    
    private ArrayList<Prospecto> prospectos;
    
        public AltaProspecto() {
        // Crear la coleccion de prospectos
        prospectos = new ArrayList<Prospecto>();
    }
        
    private void validarDatos(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, String email, String telefono) 
            throws BusinessException {
        String mensaje = "";
        if (dni==null || dni.isEmpty())
            mensaje += "\nDni no puede ser nulo o vacio";
        if (apellidoPaterno==null || apellidoPaterno.isEmpty())
            mensaje += "\nApellido Paterno no puede ser nulo o vacio";
        if (apellidoMaterno==null || apellidoMaterno.isEmpty())
            mensaje += "\nApellido Materno no puede ser nulo o vacio";
        if (nombre==null || nombre.isEmpty())
            mensaje += "\nNombre no puede ser nulo o vacio";
        if (email==null || email.isEmpty())
            mensaje += "\nEmail no puede ser nulo o vacio";
        if (telefono==null || telefono.isEmpty())
            mensaje += "\nTelefono no puede ser nulo o vacio";        
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }
    
    private void validaDuplicidad(String dni) 
            throws BusinessException {
        if (buscar(dni) != null){
            String mensaje = "DNI "+dni + " ya esta registrado.";
            throw new BusinessException(mensaje);
        }
    }
        
    public void registrar(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, String email, String telefono, String fecha) 
            throws BusinessException {
        validarDatos(dni, apellidoPaterno, apellidoMaterno, nombre, email, telefono);
        validaDuplicidad(dni);
        Prospecto nuevo = new Prospecto(dni, apellidoPaterno, apellidoMaterno, nombre, email, telefono, fecha);
        prospectos.add(nuevo);
    }

    public int getCantidadProspectos() {
        
        //System.out.println(prospectos.size());
        
        return prospectos.size();
    }

    public Prospecto buscar(String dni) {
       // Busqueda secuencial por dni
        for(Prospecto prospecto : prospectos)
            if (prospecto.getDni().equals(dni))
                return prospecto;
         return null;
    } 
    
        public String buscarProspecto(String dato, String tipo) {
            
           String mensaje = ""; 
           
         
            
        if(tipo.equals("dni")){           
       // Busqueda secuencial por dni
            for(Prospecto prospecto : prospectos) { 
         //System.out.println("DNI  " + dato + " " + prospecto.getDni());
            if (prospecto.getDni().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
              }
        
        }
        
        else if(tipo.equals("nombre")){   
           for(Prospecto prospecto : prospectos) { 
       // Busqueda secuencial por Nombre
         //System.out.println("Nombre  " + dato + " " + prospecto.getNombre());
            if (prospecto.getNombre().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
           }
        
        }
                
        else if(tipo.equals("apellido")){     
            for(Prospecto prospecto : prospectos)  {
       // Busqueda secuencial por Apellido
         //System.out.println("Ape  " + dato + " " + prospecto.getApellidoPaterno());
            if (prospecto.getApellidoPaterno().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados "  + dato; }
        
              }
        
            
        
        }
                
               
        return mensaje;
    }
    
    public void listarDatos() throws BusinessException{
        
        System.out.println(" Fecha    \t"+"Dni     \t" + "Nombre\t" + "ApePat\t" + "ApeMat\t" + "Email\t\t" + "Telefono");
        
        for(Prospecto prospecto : prospectos)
        System.out.println(" " +  prospecto.getFecha() + 
                           "\t" +  prospecto.getDni() + 
                           "\t" + prospecto.getNombre() +
                           "\t" + prospecto.getApellidoPaterno() +
                           "\t" + prospecto.getApellidMaterno() +
                           "\t" + prospecto.getEmail() +
                           "\t" + prospecto.getTelefono()
                
                );
 
        
    }
    
    public void eliminar(String dni) throws BusinessException {
       Prospecto prospecto = buscar(dni);
          if (prospecto != null)
              prospectos.remove(prospecto);
       }
        
        
        
}
