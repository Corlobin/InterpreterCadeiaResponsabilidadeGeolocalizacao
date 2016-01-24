/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.cdp;

/**
 *
 * @author Ricardo
 */
public class Cidade {
    private String nome;
    private double latitude, longitude; 

    public Cidade(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public boolean equals(Object outro) {
        if(this == outro)
            return true;
        if( !(outro instanceof Cidade))
            return false;
        
        Cidade outraCidade = (Cidade) outro;
        return getNome().equals(outraCidade.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
    
    
    
    
    
}
