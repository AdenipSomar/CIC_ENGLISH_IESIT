
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
public class AlumnoGrupoDao {
    
    conexion cn = new conexion();
    Connection con;
    
    ResultSet rs;
    PreparedStatement ps;
    
    public boolean agregarAlumnoGrupo(AlumnoGrupo ag){
        String sql = "INSERT INTO alumno_grupo_tbl (idAlumnoGrupo,matricula, cveGrupo) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ag.getIdAlumnoGrupo());
            ps.setString(2, ag.getIdAlumnoGrupo());
            ps.setString(3, ag.getCveGrupo());
       
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
   
     
    public boolean modificarAlumnoGrupo(AlumnoGrupo  ag) {
    String sql = "UPDATE alumno_grupo_tbl SET matricula=?, cveGrupo=? WHERE idAlumnoGrupo=?";

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, ag.getMatricula()); //asignar la matricula del alumno
        ps.setString(2, ag.getCveGrupo()); // asignar la clave del grupo
    

        // Asignar el rfcDocente para la cláusula WHERE
        ps.setString(3, ag.getIdAlumnoGrupo());

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
    
    
    public boolean eliminarAlumnoGrupo(String id) {
        String sql = "DELETE FROM alumno_grupo_tbl WHERE idAlumnoGrupo=?";

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
    
    
    
    //pendiente analizar que más información colocar
    public List ListarAlumnoGrupo() {
        List<AlumnoGrupo> ListaAlum = new ArrayList();
        String sql = "SELECT * FROM alumno_grupo_tbl";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AlumnoGrupo ag = new AlumnoGrupo();
                ag.setIdAlumnoGrupo(rs.getString("idAlumnoGrupo"));
                
                
                ListaAlum.add(ag);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        return ListaAlum;
    }
    
    
    
    
    
}
