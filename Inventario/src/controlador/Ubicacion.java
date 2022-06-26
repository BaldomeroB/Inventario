
package controlador;

import java.sql.ResultSet;

public class ubicacion {
    private int id_ubicacion;
    private String ubicacion;

    public ubicacion(int id_ubicacion, String ubicacion) {
        this.id_ubicacion = id_ubicacion;
        this.ubicacion = ubicacion;
    }
    
    public ubicacion(){}

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String toString(){
        return this.ubicacion;
    }
    
    public ResultSet visualizarUbicacion() {
        ResultSet rs = null;
        modelo.operacionU opeU= new modelo.operacionU(); 
        rs= opeU.visualizarU();
        return rs;
    }
}
