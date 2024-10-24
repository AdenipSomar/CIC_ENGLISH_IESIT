
package Modelo;

/**
 *
 * @author ramos
 */
public class Docente {
    
    String rfcDocente;
    String nombreDocente;
    String paternoDocente;
    String maternoDocente;
    
    String emailDocente;
    String telefonoDocente;
    
    String fechaInicioDocente;
    int estadoDocente;
    
    String cveGrupoDocente;

    public Docente() {
    }

    public Docente(String rfcDocente, String nombreDocente, String paternoDocente, String maternoDocente, String emailDocente, String telefonoDocente, String fechaInicioDocente, int estadoDocente, String cveGrupoDocente) {
        this.rfcDocente = rfcDocente;
        this.nombreDocente = nombreDocente;
        this.paternoDocente = paternoDocente;
        this.maternoDocente = maternoDocente;
        this.emailDocente = emailDocente;
        this.telefonoDocente = telefonoDocente;
        this.fechaInicioDocente = fechaInicioDocente;
        this.estadoDocente = estadoDocente;
        this.cveGrupoDocente = cveGrupoDocente;
    }

    public String getRfcDocente() {
        return rfcDocente;
    }

    public void setRfcDocente(String rfcDocente) {
        this.rfcDocente = rfcDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getPaternoDocente() {
        return paternoDocente;
    }

    public void setPaternoDocente(String paternoDocente) {
        this.paternoDocente = paternoDocente;
    }

    public String getMaternoDocente() {
        return maternoDocente;
    }

    public void setMaternoDocente(String maternoDocente) {
        this.maternoDocente = maternoDocente;
    }

    public String getEmailDocente() {
        return emailDocente;
    }

    public void setEmailDocente(String emailDocente) {
        this.emailDocente = emailDocente;
    }

    public String getTelefonoDocente() {
        return telefonoDocente;
    }

    public void setTelefonoDocente(String telefonoDocente) {
        this.telefonoDocente = telefonoDocente;
    }

    public String getFechaInicioDocente() {
        return fechaInicioDocente;
    }

    public void setFechaInicioDocente(String fechaInicioDocente) {
        this.fechaInicioDocente = fechaInicioDocente;
    }

    public int getEstadoDocente() {
        return estadoDocente;
    }

    public void setEstadoDocente(int estadoDocente) {
        this.estadoDocente = estadoDocente;
    }

    public String getCveGrupoDocente() {
        return cveGrupoDocente;
    }

    public void setCveGrupoDocente(String cveGrupoDocente) {
        this.cveGrupoDocente = cveGrupoDocente;
    }

    
    
    
    
    
   
    
}
