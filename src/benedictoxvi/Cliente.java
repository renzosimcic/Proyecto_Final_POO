
package benedictoxvi;


public class Cliente extends Persona {
   


    public Cliente(String Nombre, String ApellidoPaterno, String ApellidMaterno, String email, String dni, String telefono, String fecha) {
        this.nombre = Nombre;
        this.apellidoPaterno = ApellidoPaterno;
        this.apellidoMaterno = ApellidMaterno;
        this.email = email;
        this.dni = dni;
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
