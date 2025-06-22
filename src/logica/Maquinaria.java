package logica;


public class Maquinaria {
    int idMaquinaria;
    String nomMaquinaria;
    
    public Maquinaria(int idMaquinaria, String nomMaquinaria){
        this.idMaquinaria = idMaquinaria;
        this.nomMaquinaria = nomMaquinaria;
    }
    public int getIdMaquinaria(){
        return idMaquinaria;
    }
    public String getNomMaquinaria(){
        return nomMaquinaria;
    }
    public void setIdMaquinaria(int idMaquinaria){
        this.idMaquinaria = idMaquinaria;
    }
    public void setNomMaquinaria(String nomMaquinaria){
        this.nomMaquinaria = nomMaquinaria;
    }
}
