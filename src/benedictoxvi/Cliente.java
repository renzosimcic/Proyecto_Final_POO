/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi;

/**
 *
 * @author renzo
 */
public class Cliente {
   
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidMaterno;
    private String email;
    private String dni;
    private String telefono;
    private String fecha;

    public Cliente(String Nombre, String ApellidoPaterno, String ApellidMaterno, String email, String dni, String telefono, String fecha) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidMaterno = ApellidMaterno;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public String getApellidMaterno() {
        return ApellidMaterno;
    }

    public void setApellidMaterno(String ApellidMaterno) {
        this.ApellidMaterno = ApellidMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
