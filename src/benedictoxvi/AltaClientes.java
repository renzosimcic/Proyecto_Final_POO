/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class AltaClientes {
    
    private ArrayList<Cliente> clientes;
    
        public AltaClientes() {
        // Crear la coleccion de clientes
        clientes = new ArrayList<Cliente>();
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
        //validaDuplicidad(dni);
        Cliente nuevo = new Cliente(dni, apellidoPaterno, apellidoMaterno, nombre, email, telefono, fecha);
        clientes.add(nuevo);
    }

    public int getCantidadClientes() {
        
        //System.out.println(clientes.size());
        
        return clientes.size();
    }

    public Cliente buscar(String dni) {
       // Busqueda secuencial por dni
        for(Cliente cliente : clientes)
            if (cliente.getDni().equals(dni))
                return cliente;
         return null;
    } 
    
        public String buscarCliente(String dato, String tipo) {
            
           String mensaje = ""; 
           
         
            
        if(tipo.equals("dni")){           
       // Busqueda secuencial por dni
            for(Cliente cliente : clientes) { 
         //System.out.println("DNI  " + dato + " " + cliente.getDni());
            if (cliente.getDni().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
              }
        
        }
        
        else if(tipo.equals("nombre")){   
           for(Cliente cliente : clientes) { 
       // Busqueda secuencial por Nombre
         //System.out.println("Nombre  " + dato + " " + cliente.getNombre());
            if (cliente.getNombre().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
           }
        
        }
                
        else if(tipo.equals("apellido")){     
            for(Cliente cliente : clientes)  {
       // Busqueda secuencial por Apellido
         //System.out.println("Ape  " + dato + " " + cliente.getApellidoPaterno());
            if (cliente.getApellidoPaterno().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados "  + dato; }
        
              }
        
            
        
        }
                
               
        return mensaje;
    }
    
    public void listarDatos() throws BusinessException{
        
        System.out.println(" Fecha    \t"+"Dni     \t" + "Nombre\t" + "ApePat\t" + "ApeMat\t" + "Email\t\t" + "Telefono");
        
        for(Cliente cliente : clientes)
        System.out.println(" " +  cliente.getFecha() + 
                           "\t" +  cliente.getDni() + 
                           "\t" + cliente.getNombre() +
                           "\t" + cliente.getApellidoPaterno() +
                           "\t" + cliente.getApellidMaterno() +
                           "\t" + cliente.getEmail() +
                           "\t" + cliente.getTelefono()
                
                );
 
        
    }
    
    public void eliminar(String dni) throws BusinessException {
       Cliente cliente = buscar(dni);
          if (cliente != null)
              clientes.remove(cliente);
       }


    
}
