package logica;


public class Pais {
    int idPais;
    String nomPais;
    
    public Pais(int idPais, String nomPais){
        this.idPais = idPais;
        this.nomPais = nomPais;
    }
    
    public void setIdPais(int idPais){
        this.idPais = idPais;
    }
    
    public void setNomPais(String nomPais){
        this.nomPais = nomPais;
    }
    
    public int getIdPais(){
        return idPais;
    }
    public String getNomPais(){
        return nomPais;
    }
}
