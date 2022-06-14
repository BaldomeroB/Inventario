
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import controlador.Login;

public class operacionUsuario {
    
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement psql=null;
    
    public Login validar(String user, String pass){
        Login l = new Login();
           try
        {
            conn = modelo.conexionBD.Conexion(conn);
            
            //String SQL = "SELECT * FROM USUARIO WHERE login = '" + login + "' AND password = '" + password + "'";
            //String SQL = "SELECT login, password FROM ususario WHERE login = '" + login + "' AND password = '" + password + "'";
            String SQL = "SELECT * FROM ususario WHERE user = ? AND password = ?";
            
            psql = conn.prepareStatement(SQL);
            psql.setString(1, user);
            psql.setString(2, pass);
            rs= psql.executeQuery();
            if (rs.next()) {
                l.setId_usuario(rs.getInt("id_usuario"));
                l.setNombre(rs.getString("nombre"));
                l.setUser(rs.getString("user"));
                l.setPass(rs.getString("password"));  
            }
              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
}
