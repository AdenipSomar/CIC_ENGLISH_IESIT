package Modelo;

/**
 *
 * @author ramos
 */
public class AlumnoGrupo {

    private String idAlumnoGrupo;
    private String matricula;
    private String nombreAlumno;

    private String cveGrupo;
    private String nombreGrupo;

    public AlumnoGrupo() {

    }

    public AlumnoGrupo(String idAlumnoGrupo, String matricula, String nombreAlumno, String cveGrupo, String nombreGrupo) {
        this.idAlumnoGrupo = idAlumnoGrupo;
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.cveGrupo = cveGrupo;
        this.nombreGrupo = nombreGrupo;
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

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getCveGrupo() {
        return cveGrupo;
    }

    public void setCveGrupo(String cveGrupo) {
        this.cveGrupo = cveGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    
    

}
