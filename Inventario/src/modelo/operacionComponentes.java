
package modelo;

import controlador.componentes;
import controlador.estado;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import static modelo.operacionMarca.ps;

public class operacionComponentes {
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static PreparedStatement psql=null;
    
    public ResultSet visualizarC() {

       try {
            conn = modelo.conexionBD.Conexion(conn);
            String SQL= "SELECT c.serie, de.denominacion, ma.marca, c.modelos, c.codigoIESTP, u.ubicacion, e.estado, c.pertenece FROM componentes c INNER JOIN estado e ON c.estado_id = e.id_estado "
                    + "INNER JOIN denominacion de ON c.denominaciones = de.id_denominacion "
                    + "INNER JOIN marca ma ON c.marcas = ma.id_marca "
                    + "INNER JOIN ubicacion u ON c.ubicacion_id = u.id_ubicacion";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(SQL);
        }
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null, "" + e);
        } 
        return rs;  
    }
    
    public Vector<estado> ListarEstado(){
        Vector<estado> listaEs = new Vector<estado>();
          estado es = null;
        try {
            conn = modelo.conexionBD.Conexion(conn);
            String sql= "Select * FROM estado";
            psql = conn.prepareStatement(sql);
            rs = psql.executeQuery();
    
            es = new estado();
            es.setId_estado(0);
            es.setEstado("Selecciona Estado");
            listaEs.add(es);
    
            while(rs.next()){
                es = new estado();
                es.setId_estado(rs.getInt("id_estado"));
                es.setEstado(rs.getString("estado"));
                listaEs.add(es);
            }
        }
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null, "error" + e);
        }
        return listaEs;  
    }
    
    public boolean guardar(componentes c){
        String sql = "INSERT INTO componentes (serie, denominaciones, marcas, modelos, codigoIESTP, ubicacion_id, estado_id, pertenece) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = modelo.conexionBD.Conexion(conn);
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getSerie());
            ps.setInt(2, c.getDenominaciones());
            ps.setInt(3, c.getMarcas());
            ps.setString(4, c.getModelos());
            ps.setString(5, c.getCodigoIESTP());
            ps.setInt(6, c.getUbicacion_id());
            ps.setInt(7, c.getEstado_id());
            ps.setString(8, c.getPertenece());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    
}
