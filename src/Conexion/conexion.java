
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
     private static final String DB_URL = "jdbc:mysql://localhost:3306/cic_english_iesit?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        //JOptionPane.showMessageDialog(null, "Conexion exitosamente satisfecha satisfactoria");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el controlador de la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
    
}
