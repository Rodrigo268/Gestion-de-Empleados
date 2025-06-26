package logica;

import java.io.Serializable;

public class Empleado implements Serializable {

    String documento;
    String pais;
    String nombre;
    String apellido;
    String puestoLaboral;
    double sueldo;
    String nomMaquinaria;
    String sucursal;

    public Empleado(String documento, String pais ,String nombre, String apellido,
            String puestoLaboral, double sueldo,
            String nomMaquinaria, String sucursal) {
        this.documento = documento;
        this.pais = pais;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puestoLaboral = puestoLaboral;
        this.sueldo = sueldo;
        this.nomMaquinaria = nomMaquinaria;
        this.sucursal = sucursal;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public void setNomMaquinaria(String nomMaquinaria) {
        this.nomMaquinaria = nomMaquinaria;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNomMaquinaria() {
        return nomMaquinaria;
    }

    public String getSucursal() {
        return sucursal;
    }

}
