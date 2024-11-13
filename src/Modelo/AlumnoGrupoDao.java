
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
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }  
    
    
    
    
    
    
}
