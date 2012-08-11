
package benedictoxvi;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class AltaGrupoEstudio {
    
       private ArrayList<GrupoEstudio> gruposEstudio;
    
        public AltaGrupoEstudio() {
        // Crear la coleccion 
        gruposEstudio = new ArrayList<GrupoEstudio>();
    }
        
private void validarDatos(String nombreGrupo,String fechaInicio, String fechaFin) throws BusinessException{
        String mensaje = "";
        if (nombreGrupo==null || nombreGrupo.isEmpty())
            mensaje += "\nConcepto no puede ser nulo o vacio";
            
        if (fechaInicio==null || fechaInicio.isEmpty())
            mensaje += "\nConcepto no puede ser nulo o vacio";
            
        if (fechaFin==null || fechaFin.isEmpty())
            mensaje += "\nConcepto no puede ser nulo o vacio";
         if (! mensaje.isEmpty())
            throw new BusinessException(mensaje); 
}        


        public int getCantidadGrupoEstudio(){
    
            return gruposEstudio.size();
            
        }
        
        public void registrarGrupo(String nombreGrupo, String academia, String curso, String fechaInicio, 
                String fechaFin, String estado, String descripcion, String instructor, String syllabus, String local, String aula, String ubicacion) throws BusinessException{
            
            validarDatos(nombreGrupo, fechaInicio, fechaFin);
            
            GrupoEstudio nuevo = new GrupoEstudio(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, descripcion, instructor, syllabus, local, aula, ubicacion);
            gruposEstudio.add(nuevo);
            
             }
        
        public GrupoEstudio buscar(String numero) {
       // Busqueda secuencial por dni
        for(GrupoEstudio grupoestudio : gruposEstudio)
            if (grupoestudio.getNombreGrupo().equals(numero))
                return grupoestudio;
         return null;
    }
        
    public void listarDatos()throws BusinessException{
        
        
         for(GrupoEstudio grupoestudio : gruposEstudio)
            System.out.println(
                    " "  + grupoestudio.getNombreGrupo() + 
                    "\t" + grupoestudio.getAcademia() + 
                    "\t" + grupoestudio.getCurso() +
                    "\t" + grupoestudio.getFechaInicio() +
                    "\t" + grupoestudio.getFechaFin() +
                    "\t" + grupoestudio.getEstado() +
                    "\t" + grupoestudio.getDescripcion() +
                    "\t" + grupoestudio.getInstructor() +
                    "\t" + grupoestudio.getSyllabus() +
                    "\t" + grupoestudio.getLocal() +
                    "\t" + grupoestudio.getAula()
                    
                    );
        
    }
    
    public String BuscarGrupos() throws BusinessException{
        
        String mensaje = "";
        
         for(GrupoEstudio grupoestudio : gruposEstudio)
             System.out.println();
        
        
        return mensaje;
    }
        
        
    
}
