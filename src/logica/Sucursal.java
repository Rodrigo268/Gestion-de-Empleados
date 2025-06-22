package logica;

public class Sucursal {
    int idSucursal;
    String zona;

    public Sucursal(int id, String zona) {
        this.idSucursal = id;
        this.zona = zona;
    }

    public int getIdSucursal() {
        return idSucursal ;
    }

    public void setIdSucursal(int id) {
        this.idSucursal = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
}
