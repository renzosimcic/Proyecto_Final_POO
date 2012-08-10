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
public class AltaCompraTest {
    
    public AltaCompraTest() {
    }

    @Test
    public void debePoderVerFiltrosYTenerListadasTodasLasComprasPorFecha() {
        
        AltaCompra admin = new AltaCompra();
        
        try{
        
        admin.registrarCompra("Con1","001","01/08/2012","PC.SAC","01/09/2012","01/08/2012","Nuevo",100,19,119,1);
        admin.registrarCompra("Con2","002","05/08/2012","ENSA","09/09/2012","05/08/2012","Anulada",200,19,240,1);
        admin.registrarCompra("Con3","003","09/08/2012","WEBLOG","09/09/2012","09/08/2012","Cancel",320,19,400,1);
        
        admin.listarDatos();
        
        }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void debePoderDarDeAltaUnaCompra() {
              AltaCompra admin = new AltaCompra();
        try{
        admin.registrarCompra("Con4","004","01/08/2012","PC1.SAC","01/09/2012","01/08/2012","Nuevo",100,19,119,1);
        
        admin.listarDatos();
        
    }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void NOdebePoderDarAltaSinDatosCompletos() {
        
        AltaCompra admin = new AltaCompra();
        
        try{
        admin.registrarCompra("Con5","004","01/08/2012","PC3.SAC","01/09/2012","01/08/2012","Nuevo",100,19,119,1);
        
        admin.listarDatos();
        
    }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void debePoderBuscarPorFiltros() {
        
             AltaCompra admin = new AltaCompra();
        
        try{
            
           System.out.println(admin.BuscarCompras("con","Con5"));
            
        }catch (BusinessException ex) {
            Logger.getLogger(AltaVentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
