
package controlador;

import java.sql.ResultSet;


public class componentes {
    private String serie;
    private int denominaciones;
    private int marcas;
    private String modelos;
    private String codigoIESTP;
    private int ubicacion_id;
    private int estado_id;
    private String pertenece;

    public componentes(String serie, int denominaciones, int marcas, String modelos, String codigoIESTP, int ubicacion_id, int estado_id, String pertenece) {
        this.serie = serie;
        this.denominaciones = denominaciones;
        this.marcas = marcas;
        this.modelos = modelos;
        this.codigoIESTP = codigoIESTP;
        this.ubicacion_id = ubicacion_id;
        this.estado_id = estado_id;
        this.pertenece = pertenece;
    }

    public componentes(){}

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getDenominaciones() {
        return denominaciones;
    }

    public void setDenominaciones(int denominaciones) {
        this.denominaciones = denominaciones;
    }

    public int getMarcas() {
        return marcas;
    }

    public void setMarcas(int marcas) {
        this.marcas = marcas;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getCodigoIESTP() {
        return codigoIESTP;
    }

    public void setCodigoIESTP(String codigoIESTP) {
        this.codigoIESTP = codigoIESTP;
    }

    public int getUbicacion_id() {
        return ubicacion_id;
    }

    public void setUbicacion_id(int ubicacion_id) {
        this.ubicacion_id = ubicacion_id;
    }

    public String getPertenece() {
        return pertenece;
    }

    public void setPertenece(String pertenece) {
        this.pertenece = pertenece;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }
    
    public ResultSet visualizarComponentes() {
        ResultSet rs = null;
        modelo.operacionComponentes opeC= new modelo.operacionComponentes(); 
        rs= opeC.visualizarC();
        return rs;
    }
    
}
