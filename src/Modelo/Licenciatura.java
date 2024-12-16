
package Modelo;


public class Licenciatura {
    
    String rvoe ;
    String nombreLicenciatura;
    String abreviacion;

    public Licenciatura() {
    }

    public Licenciatura(String rvoe, String nombreLicenciatura, String abreviacion) {
        this.rvoe = rvoe;
        this.nombreLicenciatura = nombreLicenciatura;
        this.abreviacion = abreviacion;
    }

    public String getRvoe() {
        return rvoe;
    }

    public void setRvoe(String rvoe) {
        this.rvoe = rvoe;
    }

    public String getNombreLicenciatura() {
        return nombreLicenciatura;
    }

    public void setNombreLicenciatura(String nombreLicenciatura) {
        this.nombreLicenciatura = nombreLicenciatura;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    
    
    
    
    
    
}
