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
import Modelo.Grupo;
import Modelo.GrupoDao;

/**
 *
 * @author ramos
 */
public class GrupoDao {
    
    
    conexion cn = new conexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean agregarGrupo(Grupo grp){
        String sql = "INSERT INTO grupo_tbl (cveGrupo, nombreGrupo, nivelIngles, diaClase1,horarioClase1, salonClase1, diaClase2, horarioClase2, salonClase2, cicloEscolar, maxEstudiantes) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, grp.getCveGrupo());
            ps.setString(2, grp.getNombreGrupo());
            ps.setString(3, grp.getNivelIngles());
            ps.setString(4, grp.getDiaClase1());
            ps.setString(5, grp.getHorarioClase1());
            ps.setString(6, grp.getSalonClase1());
            
            ps.setString(7, grp.getDiaClase2());
            ps.setString(8, grp.getHorarioClase2());
            ps.setString(9, grp.getSalonClase2());
            ps.setString(10, grp.getCicloEscolar());
            ps.setInt(11, grp.getMaxEstudiantes());
           
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
    
    public List ListarGrupo() {
        List<Grupo> ListaGrp = new ArrayList();
        String sql = "SELECT * FROM grupo_tbl";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Grupo grp = new Grupo();
                grp.setCveGrupo(rs.getString("cveGrupo"));
                grp.setNombreGrupo(rs.getString("nombreGrupo"));
                grp.setNivelIngles(rs.getString("nivelIngles")); 
                grp.setDiaClase1(rs.getString("diaClase1")); 
                grp.setHorarioClase1(rs.getString("horarioClase1"));
                grp.setSalonClase1(rs.getString("salonClase1"));
                grp.setDiaClase2(rs.getString("diaClase2")); 
                grp.setHorarioClase2(rs.getString("horarioClase2"));
                grp.setSalonClase2(rs.getString("salonClase2"));
                grp.setCicloEscolar(rs.getString("cicloEscolar"));
                grp.setMaxEstudiantes(rs.getInt("maxEstudiantes"));
               
                ListaGrp.add(grp);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaGrp;
    }
    
    public boolean modificarGrupo(Grupo grp) {
    String sql = "UPDATE grupo_tbl SET nombreGrupo=?, nivelIngles=?, diaClase1=?, horarioClase1=?, salonClase1=?, diaClase2=?, horarioClase2=?, salonClase2=?,cicloEscolar=?, maxEstudiantes=? WHERE cveGrupo=?";

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, grp.getNombreGrupo()); // Asignar el nombre del docente
        ps.setString(2, grp.getNivelIngles());
        
        ps.setString(3, grp.getDiaClase1());
        ps.setString(4, grp.getHorarioClase1()); 
        ps.setString(5, grp.getSalonClase1());
        
        ps.setString(6, grp.getDiaClase2());
        ps.setString(7, grp.getHorarioClase2()); 
        ps.setString(8, grp.getSalonClase2());
        
        ps.setString(9, grp.getCicloEscolar());
        ps.setInt(10, grp.getMaxEstudiantes());
        
        // Asignar el rfcDocente para la cláusula WHERE
        ps.setString(11, grp.getCveGrupo());

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

    public boolean eliminarGrupo(String id) {
        String sql = "DELETE FROM grupo_tbl WHERE cveGrupo=?";

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
        
    public List<Grupo> obtenerGrupo() {
        List<Grupo> grupos = new ArrayList<>();
        String query = "SELECT nombreGrupo, cveGrupo FROM grupo_tbl";
        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String nombreGrupo = rs.getString("nombreGrupo");
            
                String cveGrupo = rs.getString("cveGrupo");
                int maxEstudiantes = 0; // Usamos 0 para suplir el valor int
               
                Grupo grupo;
                grupo = new Grupo(cveGrupo, nombreGrupo, "", "", "", "","", "", "", "", maxEstudiantes);
                grupos.add(grupo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ciudades desde la base de datos: " + e.getMessage());
        }
        return grupos;
    }
    
}
