package modelo;

import controlador.denominacion;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;


public class operacionDeno {
    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    
    public Vector<denominacion> ListarDenominacion(){
        Vector<denominacion> listaDe = new Vector<denominacion>();
          denominacion cd = null;
        try {
            conn = modelo.conexionBD.Conexion(conn);
            String sql= "Select * FROM denominacion";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
    
            cd = new denominacion();
            cd.setId_denominacion(0);
            cd.setDenominacion("Selecciona Denominación");
            listaDe.add(cd);
    
            while(rs.next()){
                cd = new denominacion();
                cd.setId_denominacion(rs.getInt("id_denominacion"));
                cd.setDenominacion(rs.getString("denominacion"));
                listaDe.add(cd);
            }
        }
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null, "error" + e);
        }
        return listaDe;  
    }
    
    public boolean guardarDenominacion(denominacion de){
        String sql = "INSERT INTO denominacion (denominacion) VALUES (?)";
        try {
            conn = modelo.conexionBD.Conexion(conn);
            ps = conn.prepareStatement(sql);
            ps.setString(1, de.getDenominacion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
