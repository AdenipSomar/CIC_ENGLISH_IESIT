/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ramos
 */
public class Alumno {
     String matricula;
    String nombreAlumno;
    String apellidoPaterno;
    String apellidoMaterno;
    String generacion;
    
    int semestre;
    String statusConstancia;
    String observaciones;
    
    String rvoeLicenciatura;
    String nombreLicenciatura;
    
    String cveGrupo;
    String nombreGrupo;

    public Alumno() {
    }

    public Alumno(String matricula, String nombreAlumno, String apellidoPaterno, String apellidoMaterno, String generacion, int semestre, String statusConstancia, String observaciones, String rvoeLicenciatura, String nombreLicenciatura, String cveGrupo, String nombreGrupo) {
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.generacion = generacion;
        this.semestre = semestre;
        this.statusConstancia = statusConstancia;
        this.observaciones = observaciones;
        this.rvoeLicenciatura = rvoeLicenciatura;
        this.nombreLicenciatura = nombreLicenciatura;
        this.cveGrupo = cveGrupo;
        this.nombreGrupo = nombreGrupo;
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getStatusConstancia() {
        return statusConstancia;
    }

    public void setStatusConstancia(String statusConstancia) {
        this.statusConstancia = statusConstancia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRvoeLicenciatura() {
        return rvoeLicenciatura;
    }

    public void setRvoeLicenciatura(String rvoeLicenciatura) {
        this.rvoeLicenciatura = rvoeLicenciatura;
    }

    public String getNombreLicenciatura() {
        return nombreLicenciatura;
    }

    public void setNombreLicenciatura(String nombreLicenciatura) {
        this.nombreLicenciatura = nombreLicenciatura;
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
