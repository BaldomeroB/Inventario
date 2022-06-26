package modelo;


import controlador.marca;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;


public class operacionMarca {
    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    public Vector<marca> ListarMarca(Integer idDeno){
        Vector<marca> listaDe = new Vector<marca>();
        marca ma = null;
        String sql = "SELECT * FROM marca WHERE denominacion_id =" + idDeno;
        try {
            conn = modelo.conexionBD.Conexion(conn);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ma = new marca();
            ma.setId_marca(0);
            ma.setMarca("Selecciona Marca");
            listaDe.add(ma);
            
            while (rs.next()) {   
                ma = new marca();
                ma.setId_marca(rs.getInt("id_marca"));
                ma.setMarca(rs.getString("marca"));
                listaDe.add(ma);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
        return listaDe;
    }
    
    public boolean guardarMarca(marca ma){
        String sql = "INSERT INTO marca (denominacion_id, marca) VALUES (?,?)";
        try {
            conn = modelo.conexionBD.Conexion(conn);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, ma.getDenominacion_id());
            ps.setString(2, ma.getMarca());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

}
