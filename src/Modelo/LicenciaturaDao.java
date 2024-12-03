
package Modelo;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class LicenciaturaDao {
    
     
    conexion cn = new conexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean agregarLicenciatura(Licenciatura lic){
        String sql = "INSERT INTO licenciatura_tbl (rvoe,nombreLicenciatura) VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lic.getRvoe());
            ps.setString(2, lic.getNombreLicenciatura());
            
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
    
     public List ListarLicenciatura() {
        List<Licenciatura> ListaLic = new ArrayList();
        String sql = "SELECT * FROM licenciatura_tbl";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Licenciatura lic = new Licenciatura();
                lic.setRvoe(rs.getString("rvoe"));
                lic.setNombreLicenciatura(rs.getString("nombreLicenciatura"));            
                ListaLic.add(lic);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaLic;
    }
     
     public boolean modificarLicenciatura(Licenciatura lic) {
    String sql = "UPDATE licenciatura_tbl SET "
            + "rvoe=?, "
            + "nombreLicenciatura=?"
            + " WHERE rvoe=?";
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1,lic.getRvoe());
        ps.setString(2, lic.getNombreLicenciatura());      
        ps.setString(3,lic.getRvoe()); // Este setString() está de más NO borrar
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

     public boolean eliminarLicenciatura(String id) {
        String sql = "DELETE FROM licenciatura_tbl WHERE rvoe=?";

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
    
     // Método para obtener la lista de ciudades desde la base de datos
     public List<Licenciatura> obtenerLicenciatura() {
        List<Licenciatura> licenciaturas = new ArrayList<>();
        String query = "SELECT nombreLicenciatura, rvoe FROM licenciatura_tbl";
        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String nombreLic = rs.getString("nombreLicenciatura");
                String rvoe = rs.getString("rvoe");
                // Crear objeto Ciudad y agregarlo a la lista
                Licenciatura lic = new Licenciatura(rvoe, nombreLic);
                licenciaturas.add(lic);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ciudades desde la base de datos: " + e.getMessage());
        }
        return licenciaturas;
    }
     
}
