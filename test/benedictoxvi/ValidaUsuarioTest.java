
package benedictoxvi;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class ValidaUsuarioTest {
    


    @Test
    public void agregarUsuario() {
        
        ValidaUsuario admin = new ValidaUsuario();
        
        //Nombre, ApellidoPaterno, ApellidMaterno, email, dni, telefono, usuario, contrasenha
        
        try{
        
        admin.registrarUsuario("Juan", "Perez", "Sans", "jperez@gmail.com", "45873982", "998778665", "jperez", "1234");
        
        admin.listarDatos();
        
        System.out.println( admin.validarUsuario("jperez", "1234"));
        
        }catch (BusinessException ex) {
            Logger.getLogger(AltaCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void ValidaUsuarioTest() {
        
        ValidaUsuario admin = new ValidaUsuario();
        
        System.out.println( admin.validarUsuario("jperez", "1234"));
        
        
        
    }

        
        
}
