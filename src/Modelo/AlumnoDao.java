/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class AlumnoDao {
    conexion cn = new conexion();
    Connection con;
  
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean agregarAlumno(Alumno alum){
        String sql = "INSERT INTO alumno_tbl (matricula, nombreAlumno, apePaternoAlumno, apeMaternoAlumno,generacion, semestre, estatusConstancia, observaciones, rvoe) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, alum.getMatricula());
            ps.setString(2, alum.getNombreAlumno());
            ps.setString(3, alum.getApellidoPaterno());
            ps.setString(4, alum.getApellidoMaterno());
            ps.setString(5, alum.getGeneracion());
            ps.setInt(6, alum.getSemestre());      
            ps.setInt(7, alum.getStatusConstancia());
            ps.setString(8, alum.getObservaciones());
            ps.setString(9, alum.getRvoeLicenciatura());
            
           
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                 if (con != null) {
            con.close(); // Cierra la conexión
                    }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
        

    } 
    
    public List<Alumno> listarAlumnos(String filtro) {
    List<Alumno> listaAlum = new ArrayList<>();
    String sql = "call OBTENER_ALUMNO(?)";

    try (Connection con = cn.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, filtro); // Pasar el filtro al procedimiento almacenado
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Alumno alum = new Alumno();
                alum.setMatricula(rs.getString("matricula"));
                alum.setNombreAlumno(rs.getString("nombreAlumno"));
                alum.setApellidoPaterno(rs.getString("apePaternoAlumno"));
                alum.setApellidoMaterno(rs.getString("apeMaternoAlumno"));
                alum.setGeneracion(rs.getString("generacion"));
                alum.setSemestre(rs.getInt("semestre"));
                alum.setStatusConstancia(rs.getInt("estatusConstancia"));
                alum.setObservaciones(rs.getString("observaciones"));
                alum.setRvoeLicenciatura(rs.getString("rvoe"));
                alum.setNombreLicenciatura(rs.getString("nombreLicenciatura"));
                alum.setAbreviacion(rs.getString("licenciatura"));
                
                listaAlum.add(alum);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar alumnos: " + e.getMessage());
    }
    return listaAlum;
}  
    
    public boolean modificarAlumno(Alumno alum) { 
      String sql = "UPDATE alumno_tbl SET nombreAlumno=?, apePaternoAlumno=?, apeMaternoAlumno=?, generacion=?, semestre=?, estatusConstancia=?, observaciones=?, rvoe=? WHERE matricula=?";

    try {
        Connection con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, alum.getNombreAlumno()); // Asignar el nombre del alumno
        ps.setString(2, alum.getApellidoPaterno());
        ps.setString(3, alum.getApellidoMaterno());
        ps.setString(4, alum.getGeneracion());
        ps.setInt(5, alum.getSemestre());
        ps.setInt(6, alum.getStatusConstancia());
        ps.setString(7, alum.getObservaciones());
        ps.setString(8, alum.getRvoeLicenciatura());

        // Asignar la matricula para la cláusula WHERE
        ps.setString(9, alum.getMatricula());

        ps.execute();
        JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO ");
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        try {
             if (con != null) {
            con.close(); // Cierra la conexión
        }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
        
        
}

    
    public boolean eliminarAlumno(String id) {
        String sql = "DELETE FROM alumno_tbl WHERE matricula=?";

        try {
            Connection con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "No es posible eliminar este registro \n "
                    + "Está siendo utilizado", "Error de borrado", JOptionPane.WARNING_MESSAGE);
            return false;
        } finally {
            try {
                if (con != null) {
            con.close(); // Cierra la conexión
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
                
            }
        }

    }
    
    public List<Alumno> obtenerAlumno() {
        List<Alumno> alumnos = new ArrayList<>();
        //String query = "SELECT nombreGrupo, cveGrupo FROM grupo_tbl";
        String query = "CALL OBTENER_ALUMNO()";
        
        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String nombreAlumno = rs.getString("nombreCompleto");
                String matricula = rs.getString("matricula");
                int semestre = 0; // Usamos 0 para suplir el valor int
                int Status= 0;

                Alumno alumno = new Alumno(matricula, nombreAlumno, "","","",semestre, Status, "", "","","","","");
                alumnos.add(alumno);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ciudades desde la base de datos: " + e.getMessage());
        }
        return alumnos;
    }
    
    
   
    
    
}
