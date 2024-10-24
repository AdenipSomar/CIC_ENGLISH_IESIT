
package Modelo;

/**
 *
 * @author ramos
 */
public class Grupo {
    
    String cveGrupo;
    String nombreGrupo;
    String nivelIngles;
    
    String diaClase1;
    String horarioClase1;
    String salonClase1;
    
    String diaClase2;
    String horarioClase2;
    String salonClase2;
    
    String cicloEscolar;
    int maxEstudiantes;

    public Grupo() {
    }

    public Grupo(String cveGrupo, String nombreGrupo, String nivelIngles, String diaClase1, String horarioClase1, String salonClase1, String diaClase2, String horarioClase2, String salonClase2, String cicloEscolar, int maxEstudiantes) {
        this.cveGrupo = cveGrupo;
        this.nombreGrupo = nombreGrupo;
        this.nivelIngles = nivelIngles;
        this.diaClase1 = diaClase1;
        this.horarioClase1 = horarioClase1;
        this.salonClase1 = salonClase1;
        this.diaClase2 = diaClase2;
        this.horarioClase2 = horarioClase2;
        this.salonClase2 = salonClase2;
        this.cicloEscolar = cicloEscolar;
        this.maxEstudiantes = maxEstudiantes;
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

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getDiaClase1() {
        return diaClase1;
    }

    public void setDiaClase1(String diaClase1) {
        this.diaClase1 = diaClase1;
    }

    public String getHorarioClase1() {
        return horarioClase1;
    }

    public void setHorarioClase1(String horarioClase1) {
        this.horarioClase1 = horarioClase1;
    }

    public String getSalonClase1() {
        return salonClase1;
    }

    public void setSalonClase1(String salonClase1) {
        this.salonClase1 = salonClase1;
    }

    public String getDiaClase2() {
        return diaClase2;
    }

    public void setDiaClase2(String diaClase2) {
        this.diaClase2 = diaClase2;
    }

    public String getHorarioClase2() {
        return horarioClase2;
    }

    public void setHorarioClase2(String horarioClase2) {
        this.horarioClase2 = horarioClase2;
    }

    public String getSalonClase2() {
        return salonClase2;
    }

    public void setSalonClase2(String salonClase2) {
        this.salonClase2 = salonClase2;
    }

    public String getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(String cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public void setMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }

   
    
}
