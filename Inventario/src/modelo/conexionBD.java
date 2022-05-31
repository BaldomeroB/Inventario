package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionBD {

    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;

    public static Connection Conexion(Connection conn) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario_1", "root", " ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puedo conectar a la base de datos" + ex);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se puedo encontrar el driver");
        }
        return conn;
    }

    public static void cerrar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
