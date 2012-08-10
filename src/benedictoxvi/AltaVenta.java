
package benedictoxvi;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class AltaVenta {
    
        private ArrayList<Venta> ventas;
    
        public AltaVenta() {
        // Crear la coleccion 
        ventas = new ArrayList<Venta>();
    }
        
        private void validarDatos(String concepto,String fechadeemision, String fechadevencimiento,
                double subtotal, double igv, double total, double moneda) 
            throws BusinessException {
        String mensaje = "";
        if (concepto==null || concepto.isEmpty())
            mensaje += "\nConcepto no puede ser nulo o vacio";
        if (fechadeemision==null || fechadeemision.isEmpty())
            mensaje += "\nfecha de emision no puede ser nulo o vacio";
        if (fechadevencimiento==null || fechadevencimiento.isEmpty())
            mensaje += "\nfecha de vencimiento no puede ser nulo o vacio";
        if (subtotal <= 0)
            mensaje += "\n Subtotal no puede ser nulo o vacio";
        if (igv <= 0)
            mensaje += "\nigv no puede ser nulo o vacio";
        if (total <= 0)
            mensaje += "\nTotal no puede ser nulo o vacio"; 
        if (moneda <= 0)
            mensaje += "\nMoneda no puede ser nulo o vacio";         
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }
        
         
    public void registrarVenta(String concepto, String numero, String fechadeemision, String empresa, 
            String fechadevencimiento, String fechadepago, String estado, double subtotal, double igv, double total, double moneda) throws BusinessException {
        validarDatos(concepto,fechadeemision,fechadevencimiento,subtotal,igv,total,moneda);
        //validaDuplicidad(dni);
        Venta nuevo = new Venta(concepto, numero, fechadeemision, empresa, fechadevencimiento, fechadepago, estado, subtotal, igv, total, moneda);
        ventas.add(nuevo);
    }
    
        public int getCantidadVentas() {
        
        return ventas.size();
    }

    public Venta buscar(String numero) {
       // Busqueda secuencial por dni
        for(Venta venta : ventas)
            if (venta.getNumero().equals(numero))
                return venta;
         return null;
    } 
    
    public void listarDatos()throws BusinessException{
        
        
        for(Venta venta : ventas)
            System.out.println(" " + venta.getNumero() + 
                    "\t" + venta.getConcepto() + 
                    "\t" + venta.getEmpresa() +
                    "\t" + venta.getEstado() +
                    "\t" + venta.getFechadeemision() +
                    "\t" + venta.getFechadepago() +
                    "\t" + venta.getFechadevencimiento() +
                    "\t" + venta.getIgv()+
                    "\t" + venta.getMoneda() +
                    "\t" + venta.getSubtotal() +
                    "\t" + venta.getTotal()
                    );
        
    }
    
    
    public String BuscarVentas(String tipo, String dato) throws BusinessException{
        
           String mensaje = ""; 
                   
        if(tipo.equals("con")){           
       // Busqueda secuencial
            for(Venta venta : ventas) { 
         
            if (venta.getConcepto().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
              }
        
        }
        
        return mensaje; 
        
    }
    
    
        
    
}
