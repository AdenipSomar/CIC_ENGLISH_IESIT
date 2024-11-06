
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
public class DocenteDao {
    
    conexion cn = new conexion();
    Connection con;
    
    ResultSet rs;
    PreparedStatement ps;
    
    
     public boolean agregarDocente(Docente doce){
        String sql = "INSERT INTO docente_tbl (rfcDocente, nombreDocente,apePaternoDocente, apeMaternoDocente,email,telefono, fechaInicio, estado) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, doce.getRfcDocente());
            ps.setString(2, doce.getNombreDocente());
            ps.setString(3, doce.getPaternoDocente());
            ps.setString(4, doce.getMaternoDocente());
            ps.setString(5, doce.getEmailDocente());
            ps.setString(6, doce.getTelefonoDocente());
            ps.setString(7, doce.getFechaInicioDocente());
            ps.setInt(8, doce.getEstadoDocente());
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }  
    
     public List ListarDocente() {
        List<Docente> ListaDoc = new ArrayList();
        String sql = "SELECT * FROM docente_tbl";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Docente doce = new Docente();
                doce.setRfcDocente(rs.getString("rfcDocente"));
                doce.setNombreDocente(rs.getString("nombreDocente"));  
                doce.setPaternoDocente(rs.getString("apePaternoDocente"));  
                doce.setMaternoDocente(rs.getString("apeMaternoDocente")); 
                doce.setEmailDocente(rs.getString("email"));  
                doce.setTelefonoDocente(rs.getString("telefono")); 
                doce.setFechaInicioDocente(rs.getString("fechaInicio"));  
                doce.setEstadoDocente(rs.getInt("estado"));  
                
                ListaDoc.add(doce);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaDoc;
    }
    
     public boolean modificarLDocente(Docente doce) {
    String sql = "UPDATE docente_tbl SET nombreDocente=?, apePaternoDocente=?, apeMaternoDocente=?, email=?, telefono=?, fechaInicio=?, estado=? WHERE rfcDocente=?";

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, doce.getNombreDocente()); // Asignar el nombre del docente
        ps.setString(2, doce.getPaternoDocente()); // Asignar el apellido paterno
        ps.setString(3, doce.getMaternoDocente()); // Asignar el apellido materno
        ps.setString(4, doce.getEmailDocente()); // Asignar el email
        ps.setString(5, doce.getTelefonoDocente()); // Asignar el teléfono
        ps.setString(6, doce.getFechaInicioDocente()); // Asignar la fecha de inicio
        ps.setInt(7, doce.getEstadoDocente()); // Asignar el estado (1 o 0)
        

        // Asignar el rfcDocente para la cláusula WHERE
        ps.setString(8, doce.getRfcDocente());

        ps.execute();
        JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO ");
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}

    
     public boolean eliminarDocente(String id) {
        String sql = "DELETE FROM docente_tbl WHERE rfcDocente=?";

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
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
                
            }
        }

    }
    
     public List<Docente> obtenerDocente() {
        List<Docente> docentes = new ArrayList<>();
//        String query = "SELECT  nombreDocente, rfcDocente FROM docente_tbl";
         String query = "call OBTENER_DOCENTE()";
        try (Connection con = conexion.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String nombreDocente = rs.getString("nombreCompleto");
                String rfcDocente = rs.getString("rfcDocente");
//                String paternoDocente = rs.getString("apePaternoDocente");
//                String maternoDocente = rs.getString("apeMaternoDocente");
                int estado = 0;
                // Crear objeto Ciudad y agregarlo a la lista
                Docente doc = new Docente(rfcDocente, nombreDocente, "", "", "", "", "", estado,"");
                docentes.add(doc);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener: " + e.getMessage());
        }
        return docentes;
    }
    
     
     
     
}
