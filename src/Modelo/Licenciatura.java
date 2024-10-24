
package Modelo;


public class Licenciatura {
    
    String rvoe ;
    String nombreLicenciatura;

    public Licenciatura() {
    }

    
    public Licenciatura(String rvoe, String nombreLicenciatura) {
        this.rvoe = rvoe;
        this.nombreLicenciatura = nombreLicenciatura;
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
    
    
    
    
}
