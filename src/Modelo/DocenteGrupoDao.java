
package Modelo;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class DocenteGrupoDao {
   
    conexion cn = new conexion();
    Connection con;
    
    ResultSet rs;
    PreparedStatement ps;
    
    
    public boolean agregarDocenteGrupo(DocenteGrupo dg){
        String sql = "INSERT INTO docente_grupo_tbl (idDocenteGrupo,rfcDocente, cveGrupo) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dg.getIdDocenteGrupo());
            ps.setString(2, dg.getRfcDocente());
            ps.setString(3, dg.getCveGrupo());
       
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
    
    public boolean modificarDocenteGrupo(DocenteGrupo dg) {
    String sql = "UPDATE docente_grupo_tbl SET rfcDocente=?, cveGrupo=? WHERE idDocenteGrupo=?";

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, dg.getRfcDocente()); 
        ps.setString(2, dg.getCveGrupo()); 
        

        // Asignar el rfcDocente para la cláusula WHERE
        ps.setString(3, dg.getIdDocenteGrupo());

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
    
    public boolean eliminarDocenteGrupo(String id) {
        String sql = "DELETE FROM docente_grupo_tbl WHERE idDocenteGrupo=?";

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
    
    
    
    
    
}
