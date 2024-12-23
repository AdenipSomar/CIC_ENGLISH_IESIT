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
        String sql = "INSERT INTO alumno_tbl (matricula, nombreAlumno, apePaternoAlumno, apeMaternoAlumno,generacion, semestre, estatusConstancia, observaciones) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, alum.getMatricula());
            ps.setString(2, alum.getNombreAlumno());
            ps.setString(3, alum.getApellidoPaterno());
            ps.setString(4, alum.getApellidoMaterno());
            ps.setString(5, alum.getGeneracion());
            ps.setInt(6, alum.getSemestre());
            
            ps.setString(7, alum.getStatusConstancia());
            ps.setString(8, alum.getObservaciones());
            ps.setString(9, alum.getCveGrupo());
            ps.setString(10, alum.getRvoeLicenciatura());
            
           
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
    
//    public List ListarAlumno() {
//        List<Alumno> ListaAlum = new ArrayList();
//        String sql = "SELECT * FROM alumno_tbl";
//        try {
//            con = cn.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Alumno alum = new Alumno();
//                alum.setMatricula(rs.getString("matricula"));
//                alum.setApellidoPaterno(rs.getString("apePaternoAalumno"));
//                alum.setApellidoMaterno(rs.getString("apeMaternoAlumno"));
//                alum.setGeneracion(rs.getString("generacion"));
//                alum.setSemestre(rs.getInt("semestre"));
//                alum.setStatusConstancia(rs.getString("estatusConstancia"));
//                alum.setObservaciones(rs.getString("observaciones"));
//                alum.setCveGrupo(rs.getString("cveGrupo"));
//                alum.setNombreGrupo(rs.getString("nombreGrupo"));
//                alum.setRvoeLicenciatura(rs.getString("rvoe"));
//                alum.setNombreLicenciatura(rs.getString("nombreLicenciatura"));
//                alum.setAbreviacion(rs.getString("abreviacion"));
//                ListaAlum.add(alum);
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
//        return ListaAlum;
//    }
//    
    
    
    
    
    public boolean modificarAlumno(Alumno alum) {
    String sql = "UPDATE alumno_tbl SET nombreAlumno=?, apePaternoAlumno=?, apeMaternoAlumno=?, generacion=?, semestre=?, estatusConstancia=?, observaciones=?, cveGrupo=?,rvoe=? WHERE matricula=?";

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, alum.getNombreAlumno()); 
        ps.setString(2, alum.getApellidoPaterno());    
        ps.setString(3, alum.getApellidoMaterno());
        ps.setString(4, alum.getGeneracion()); 
        ps.setInt(5, alum.getSemestre());
        ps.setString(6, alum.getStatusConstancia());
        ps.setString(7, alum.getObservaciones()); 
        ps.setString(8, alum.getCveGrupo()); 
        ps.setString(9, alum.getRvoeLicenciatura());
      
        // Asignar el id para la cláusula WHERE
        ps.setString(10, alum.getMatricula());

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
    
//    public List<Alumno> obtenerAlumno() {
//        List<Alumno> alumnos = new ArrayList<>();
//        //String query = "SELECT nombreGrupo, cveGrupo FROM grupo_tbl";
//        String query = "CALL OBTENER_ALUMNO()";
//        
//        try (Connection con = conexion.getConnection();
//             PreparedStatement pst = con.prepareStatement(query);
//             ResultSet rs = pst.executeQuery()) {
//
//            while (rs.next()) {
//                String nombreAlumno = rs.getString("nombreCompleto");
//                String matricula = rs.getString("matricula");
//                int semestre = 0; // Usamos 0 para suplir el valor int
//
//                Alumno alumno = new Alumno(matricula, nombreAlumno, "","","",semestre, "", "", "","","","","");
//                alumnos.add(alumno);
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al obtener ciudades desde la base de datos: " + e.getMessage());
//        }
//        return alumnos;
//    }
    
    public List<Alumno> obtenerAlumno_busqueda() {
        List<Alumno> alumnos = new ArrayList<>();
        //String query = "SELECT nombreGrupo, cveGrupo FROM grupo_tbl";
        String query = "CALL OBTENER_ALUMNO()";
        
        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String matricula = rs.getString("matricula");
                String nombreAlumno = rs.getString("nombreCompleto");
                String abreviacion = rs.getString("licenciatura");
                int semestre = 0; // Usamos 0 para suplir el valor int      
//                // Crear el mensaje concatenado
//    String mensaje = "Matrícula: " + matricula + 
//                     "\nNombre Completo: " + nombreAlumno + 
//                     "\nLicenciatura: " + abreviacion;
//     JOptionPane.showMessageDialog(null, mensaje);

                Alumno alumno = new Alumno(matricula, nombreAlumno, "","","",semestre, "", "", "","",abreviacion,"","");
                alumnos.add(alumno);
                
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ciudades desde la base de datos: " + e.getMessage());
        }
        return alumnos;
    }
    
    
   
    
    
}
