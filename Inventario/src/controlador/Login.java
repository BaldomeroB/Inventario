
package controlador;

import java.sql.ResultSet;


public class Login {
    private int id_usuario;
    private String nombre;
    private String user;
    private String pass;
    
    public Login(int id_usuario, String nombre, String user, String pass) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        
    }

    public Login() {
    }

    public int getId() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
