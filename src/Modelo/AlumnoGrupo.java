
package Modelo;

/**
 *
 * @author ramos
 */
public class AlumnoGrupo {
    
    
    private String idAlumnoGrupo;
    private String matricula;
    private String cveGrupo;
    
    
    public AlumnoGrupo(){
    
    }

    public AlumnoGrupo(String idAlumnoGrupo, String matricula, String cveGrupo) {
        this.idAlumnoGrupo = idAlumnoGrupo;
        this.matricula = matricula;
        this.cveGrupo = cveGrupo;
    }

    public String getIdAlumnoGrupo() {
        return idAlumnoGrupo;
    }

    public void setIdAlumnoGrupo(String idAlumnoGrupo) {
        this.idAlumnoGrupo = idAlumnoGrupo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCveGrupo() {
        return cveGrupo;
    }

    public void setCveGrupo(String cveGrupo) {
        this.cveGrupo = cveGrupo;
    }
    
    
    
    
}
