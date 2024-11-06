
package Modelo;

/**
 *
 * @author ramos
 */
public class DocenteGrupo {
    
   private String idDocenteGrupo;
   private String  rfcDocente;
   private String cveGrupo;

    public DocenteGrupo() {
    }

    public DocenteGrupo(String idDocenteGrupo, String rfcDocente, String cveGrupo) {
        this.idDocenteGrupo = idDocenteGrupo;
        this.rfcDocente = rfcDocente;
        this.cveGrupo = cveGrupo;
    }

    public String getIdDocenteGrupo() {
        return idDocenteGrupo;
    }

    public void setIdDocenteGrupo(String idDocenteGrupo) {
        this.idDocenteGrupo = idDocenteGrupo;
    }

    public String getRfcDocente() {
        return rfcDocente;
    }

    public void setRfcDocente(String rfcDocente) {
        this.rfcDocente = rfcDocente;
    }

    public String getCveGrupo() {
        return cveGrupo;
    }

    public void setCveGrupo(String cveGrupo) {
        this.cveGrupo = cveGrupo;
    }

    
   
    
    
    
}
