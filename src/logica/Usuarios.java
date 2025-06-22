package logica;

import java.io.Serializable;

public class Usuarios implements Serializable {

    int id;
    String nombreUsuario;
    String passwordUsuario;

    public Usuarios(int id, String nombreUsuario, String passwordUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;

    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public int getId() {
        return id;
    }

}
