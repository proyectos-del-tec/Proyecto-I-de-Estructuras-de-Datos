/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Leandro Montero
 */
public class Conductor {
    String Nombre;
    int Cedula;
    int Telefono;
    String Placa;
    Conductor sig;

    public Conductor(String Nombre, int Cedula, int Telefono,String Placa) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Placa=Placa;
        this.Telefono = Telefono;
        this.sig = null;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Conductor getSig() {
        return sig;
    }

    public void setSig(Conductor sig) {
        this.sig = sig;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
}
