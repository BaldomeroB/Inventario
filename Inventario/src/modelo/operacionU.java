
package modelo;

import controlador.ubicacion;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;


public class operacionU {
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static PreparedStatement psql=null;
    
    public ResultSet visualizarU() {

       try {
            conn = modelo.conexionBD.Conexion(conn);
            String SQL= "Select * FROM ubicacion";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(SQL);
        }
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null, "" + e);
        } 
        return rs;  
    }
    
    public Vector<ubicacion> ListarUbicacion(){
        Vector<ubicacion> listaU = new Vector<ubicacion>();
          ubicacion u = null;
        try {
            conn = modelo.conexionBD.Conexion(conn);
            String sql= "Select * FROM ubicacion";
            psql = conn.prepareStatement(sql);
            rs = psql.executeQuery();
    
            u = new ubicacion();
            u.setId_ubicacion(0);
            u.setUbicacion("Selecciona Ubicacion");
            listaU.add(u);
    
            while(rs.next()){
                u = new ubicacion();
                u.setId_ubicacion(rs.getInt("id_ubicacion"));
                u.setUbicacion(rs.getString("ubicacion"));
                listaU.add(u);
            }
        }
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null, "error" + e);
        }
        return listaU;  
    }
}
