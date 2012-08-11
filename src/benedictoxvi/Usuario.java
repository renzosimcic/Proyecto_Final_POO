
package benedictoxvi;


public class Usuario {
    
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidMaterno;
    private String email;
    private String dni;
    private String telefono;
    
    private String usuario;
    private String contrasenha;

    public Usuario(String Nombre, String ApellidoPaterno, String ApellidMaterno, String email, String dni, String telefono, String usuario, String contrasenha) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidMaterno = ApellidMaterno;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasenha = contrasenha;
    }

    public Usuario(String usuario, String contrasenha) {
        this.usuario = usuario;
        this.contrasenha = contrasenha;
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

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
