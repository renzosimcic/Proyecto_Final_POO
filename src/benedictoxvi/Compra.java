
package benedictoxvi;


public class Compra extends Operacion {
   

   
    public Compra(String concepto, String numero, String fechadeemision, String empresa, String fechadevencimiento, String fechadepago, String estado, double subtotal, double igv, double total, double moneda) {
        this.concepto = concepto;
        this.numero = numero;
        this.fechadeemision = fechadeemision;
        this.empresa = empresa;
        this.fechadevencimiento = fechadevencimiento;
        this.fechadepago = fechadepago;
        this.estado = estado;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.moneda = moneda;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechadeemision() {
        return fechadeemision;
    }

    public void setFechadeemision(String fechadeemision) {
        this.fechadeemision = fechadeemision;
    }

    public String getFechadepago() {
        return fechadepago;
    }

    public void setFechadepago(String fechadepago) {
        this.fechadepago = fechadepago;
    }

    public String getFechadevencimiento() {
        return fechadevencimiento;
    }

    public void setFechadevencimiento(String fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
 
   
   
}
