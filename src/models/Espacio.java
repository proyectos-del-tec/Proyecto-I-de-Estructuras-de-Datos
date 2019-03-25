/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Leandro Montero L
 */
public class Espacio {
    int Numero; //Numero de espacio
    String Estado;
    int PlacaOcupante;
    Espacio ant;
    Espacio sig;
    Conductor conductorocupante;

    public Espacio(int Numero, String Estado) {
        this.Numero = Numero;
        this.Estado = Estado;
        this.ant = null;
        this.sig = null;
        this.conductorocupante=null;
    }

    public Conductor getConductorocupante() {
        return conductorocupante;
    }

    public void setConductorocupante(Conductor conductorocupante) {
        this.conductorocupante = conductorocupante;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Espacio getAnt() {
        return ant;
    }

    public void setAnt(Espacio ant) {
        this.ant = ant;
    }

    public Espacio getSig() {
        return sig;
    }

    public void setSig(Espacio sig) {
        this.sig = sig;
    }

    public int getPlacaOcupante() {
        return PlacaOcupante;
    }

    public void setPlacaOcupante(int PlacaOcupante) {
        this.PlacaOcupante = PlacaOcupante;
    }
    
    
}
