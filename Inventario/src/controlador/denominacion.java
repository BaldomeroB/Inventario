/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author PEDRO
 */
public class denominacion {
    private int id_denominacion;
    private String denominacion;

    public denominacion(int id_denominacion, String denominacion) {
        this.id_denominacion = id_denominacion;
        this.denominacion = denominacion;
    }
    
    public denominacion(){}

    public int getId_denominacion() {
        return id_denominacion;
    }

    public void setId_denominacion(int id_denominacion) {
        this.id_denominacion = id_denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    
    public String toString(){
        return this.denominacion;
    }
    
}
