/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author renzo
 */
public class AltaGrupoEstudioTest {
    
    public AltaGrupoEstudioTest() {
    }

    @Test
    public void debePoderVerFiltrosYTenerListadosTodosLosGruposDeEstudiosPorFecha() {
        
        AltaGrupoEstudio admin = new AltaGrupoEstudio();
        
        //nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, descripcion, instructor, syllabus, local, aula, ubicacion
        
        try{
            
            admin.registrarGrupo("Grupo1", "Academia A", "Calculo 1", "01/05/2012", "02/08/2012", "Activo", "Ciclo 1", "Juan Garcia", "link", "MO", "C002", "maps.google.com");
            admin.registrarGrupo("Grupo2", "Academia B", "Lenguaje", "05/07/2012", "01/08/2012", "Activo", "Ciclo 1", "Jose Perez", "link", "SI", "C005", "maps.google.com");
            admin.registrarGrupo("Grupo3", "Academia C", "Historia", "09/07/2012", "05/09/2012", "Activo", "Ciclo 1", "Maria Gomez", "link", "MO", "B006", "maps.google.com");
            
            admin.listarDatos();
                        
        }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void debePoderDarDeAltaUnGrupoDeEstudio() {
    
            AltaGrupoEstudio admin = new AltaGrupoEstudio();
        
        //nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, descripcion, instructor, syllabus, local, aula, ubicacion
        
        try{
            
            admin.registrarGrupo("Grupo4", "Academia A", "Calculo 2", "01/05/2012", "02/08/2012", "Activo", "Ciclo 2", "Juan Garcia", "link", "MO", "C002", "maps.google.com");
            
            admin.listarDatos();
                        
        }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    }
    
    @Test
    public void NOdebePoderDarAltaSinDatosCompletos() {
        
             AltaGrupoEstudio admin = new AltaGrupoEstudio();
        
        
                try{
            
            admin.registrarGrupo("Grupo4", "Academia A", "Calculo 2", "01/05/2012", "02/08/2012", "Activo", "Ciclo 2", "Juan Garcia", "link", "MO", "C002", "maps.google.com");
            
            admin.listarDatos();
                        
        }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void debePoderBuscarPorFiltros() {
        
         AltaGrupoEstudio admin = new AltaGrupoEstudio();
         
         try{
            
             admin.BuscarGrupos();
             
         }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }    
    
    
}
