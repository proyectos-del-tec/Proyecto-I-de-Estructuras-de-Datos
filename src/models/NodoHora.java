/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andrey M
 */
public class NodoHora {
    private String placa;
    private String hora;
    private NodoHora sig;

    public NodoHora(String placa, String hora) {
        this.placa = placa;
        this.hora = hora;
        this.sig = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public NodoHora getSig() {
        return sig;
    }

    public void setSig(NodoHora sig) {
        this.sig = sig;
    }
    
}
