/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author PEDRO
 */
public class marca {
    private int id_marca;
    private String marca;
    private int denominacion_id;

    public marca(int id_marca, String marca, int denominacion_id) {
        this.id_marca = id_marca;
        this.marca = marca;
        this.denominacion_id = denominacion_id;
    }
    
    public marca(){}

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDenominacion_id() {
        return denominacion_id;
    }

    public void setDenominacion_id(int denominacion_id) {
        this.denominacion_id = denominacion_id;
    }

    public String toString(){
        return this.marca;
    }
    
}
