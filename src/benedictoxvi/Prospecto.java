
package benedictoxvi;




public class Prospecto extends Persona{
    


    public Prospecto(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, String email, String telefono, String fecha) {
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public String getApellidMaterno() {
        return apellidoMaterno;
    }

    public void setApellidMaterno(String ApellidMaterno) {
        this.apellidoMaterno = ApellidMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.apellidoPaterno = ApellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
    
    
}
