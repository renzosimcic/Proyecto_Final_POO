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
public class AltaCompra {
    
            private ArrayList<Compra> compras;
    
        public AltaCompra() {
        // Crear la coleccion 
        compras = new ArrayList<Compra>();
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
        
         
    public void registrarCompra(String concepto, String numero, String fechadeemision, String empresa, 
        String fechadevencimiento, String fechadepago, String estado, double subtotal, double igv, double total, double moneda) throws BusinessException {
        validarDatos(concepto,fechadeemision,fechadevencimiento,subtotal,igv,total,moneda);
        //validaDuplicidad(dni);
        Compra nuevo = new Compra(concepto, numero, fechadeemision, empresa, fechadevencimiento, fechadepago, estado, subtotal, igv, total, moneda);
        compras.add(nuevo);
    }
    
        public int getCantidadCompra() {
        
        return compras.size();
    }

    public Compra buscar(String numero) {
       // Busqueda secuencial por dni
        for(Compra compra : compras)
            if (compra.getNumero().equals(numero))
                return compra;
         return null;
    } 
    
    public void listarDatos()throws BusinessException{
        
        
        for(Compra compra : compras)
            System.out.println(" " + compra.getNumero() + 
                    "\t" + compra.getConcepto() + 
                    "\t" + compra.getEmpresa() +
                    "\t" + compra.getEstado() +
                    "\t" + compra.getFechadeemision() +
                    "\t" + compra.getFechadepago() +
                    "\t" + compra.getFechadevencimiento() +
                    "\t" + compra.getIgv()+
                    "\t" + compra.getMoneda() +
                    "\t" + compra.getSubtotal() +
                    "\t" + compra.getTotal()
                    );
        
    }
    
    
    public String BuscarCompras(String tipo, String dato) throws BusinessException{
        
           String mensaje = ""; 
                   
        if(tipo.equals("con")){           
       // Busqueda secuencial
            for(Compra compra : compras) { 
         
            if (compra.getConcepto().equals(dato)){mensaje = "existe"; return mensaje;
            }else{mensaje = "No se encontraron registros para los filtros ingresados " + dato ; }
        
              }
        
        }
        
        return mensaje; 
        
    }
    
}
