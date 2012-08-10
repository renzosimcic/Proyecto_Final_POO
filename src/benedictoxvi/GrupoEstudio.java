
package benedictoxvi;

/**
 *
 * @author renzo
 */
public class GrupoEstudio {
    
  private String nombreGrupo;
  private String academia;	
  private String curso;	
  private String fechaInicio;	
  private String fechaFin;	
  private String estado;
  
  private String descripcion;
  private String instructor;
  private String syllabus;	
  private String local;
  private String aula;	
  private String ubicacion;

    public GrupoEstudio(String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado, String descripcion, String instructor, String syllabus, String local, String aula, String ubicacion) {
        this.nombreGrupo = nombreGrupo;
        this.academia = academia;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.syllabus = syllabus;
        this.local = local;
        this.aula = aula;
        this.ubicacion = ubicacion;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
  
  


    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

  
  
    
}
