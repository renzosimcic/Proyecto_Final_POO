
package benedictoxvi;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class AltaProspectoTest {
    
    public AltaProspectoTest() {
    }

    
        String[] dnis = {"23272090", "23259395","44886952"};
        String[] apellidosPaterno = {"Sanchez", "Aguilar","Perez"};
        String[] apellidosMaterno = {"Tejada", "Ruiz","Quispe"};
        String[] nombres = {"Juan","Jose","Pedro"};
        String[] emails = {"jsanchez@gmail.com", "jaguilar@hotmail","pquispe@hotmail.com"};
        String[] telefonos = {"992778439", "44050010","995533841"};
        String[] fechas = {"10/05/2012", "05/03/2012","09/06/2012"};
        
    @Test
    public void administradorDebeRegistrarProspectos(){
        // Arrange
               
        AltaProspecto admin = new AltaProspecto();
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }                    
        // Assert
        int cantidadProspectosEsperada = dnis.length;
        int cantidadProspectosRetornada = admin.getCantidadProspectos();
        assertEquals(cantidadProspectosEsperada, cantidadProspectosRetornada);
        for (i=0; i<dnis.length; i++){
            Prospecto prospectoBuscado = admin.buscar(dnis[i]);
            assertNotNull(prospectoBuscado);
        }
    }
    
    @Test
    public void debePoderVerFiltrosYTenerListadosTodosLosProspectosPorFecha() throws BusinessException {
        AltaProspecto admin = new AltaProspecto();
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        admin.listarDatos();
        
        //Assert.assert
        
    }
    
    @Test
    public void debePoderIngresarNuevoProspecto() throws BusinessException {
        AltaProspecto admin = new AltaProspecto();
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int cantidadProspectosEsperada = dnis.length;
        int cantidadProspectosRetornada = admin.getCantidadProspectos();
        assertEquals(cantidadProspectosEsperada, cantidadProspectosRetornada);
        for (i=0; i<dnis.length; i++){
            Prospecto prospectoBuscado = admin.buscar(dnis[i]);
            assertNotNull(prospectoBuscado);
        }
        
        
        
    }
    
    @Test
    public void NOdebePoderDarAltaSinDatosCompletos() throws BusinessException {
                // Arrange
        String dni = "";
        String apellidoPaterno = "Perez";
        String apellidoMaterno = "";
        String nombre = "Juen";
        String email = "";
        String telefono = ""; 
        String fecha = "";
        AltaProspecto admin = new AltaProspecto();        
        //Act
        //admin.registrar(dni, apellidoPaterno, apellidoMaterno, nombre, email, telefono, fecha);
        //Assert
        // No necesitamos comprobar pues se espera que suceda un error 
    }
    
    @Test
    public void debePoderBuscarPorFiltros() {
                //“No se encontraron registros para los filtros ingresados”
        
               AltaProspecto admin = new AltaProspecto();
       
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        System.out.println( admin.buscarProspecto("23272090","dni"));
        System.out.println( admin.buscarProspecto("Jose","nombre"));
        System.out.println( admin.buscarProspecto("Perez","apellido"));
        
    }
    

    
    @Test
    public void debeMostrarMensajeDeErrorSiNoExiste() {
        //“No se encontraron registros para los filtros ingresados”
        
               AltaProspecto admin = new AltaProspecto();
       
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        System.out.println( admin.buscarProspecto("44277695","dni"));
        

     }
    
    @Test
    public void NOdebePoderDarDeAltaSiElProspectoYaEsCliente() {
        
    }
    
    @Test
    public void debePoderEliminarProspectos() throws BusinessException {
        
       AltaProspecto admin = new AltaProspecto();
       
        // Act
        int i;
        for(i = 0; i<dnis.length; i++)
            try {
            admin.registrar(dnis[i], 
                            apellidosPaterno[i],
                            apellidosMaterno[i],
                            nombres[i],
                            emails[i],
                            telefonos[i],
                            fechas[i]);
            
            //System.out.println(i);
            
        } catch (BusinessException ex) {
            Logger.getLogger(AltaProspectoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        admin.eliminar("44886952");
        
        Assert.assertNull(admin.buscar("44886952"));
        
    }    
    
    
    
}
