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
public class ColaDeHoras {
    private NodoHora primeraHora;
    private NodoHora ultimaHora;

    public ColaDeHoras() {
        this.primeraHora = null;
        this.ultimaHora = null;
    }

    public NodoHora getPrimeraHora() {
        return primeraHora;
    }

    public void setPrimeraHora(NodoHora primeraHora) {
        this.primeraHora = primeraHora;
    }

    public NodoHora getUltimaHora() {
        return ultimaHora;
    }

    public void setUltimaHora(NodoHora ultimaHora) {
        this.ultimaHora = ultimaHora;
    }
    
    public int cantidadHorasDeCola(){
        int cont = 0;
        for (NodoHora horaTemp = ultimaHora; horaTemp != null; horaTemp= horaTemp.getSig()) {
            cont++;
        }
        return cont;
    }
    
    public void agragarNuevaHora(String placa, String hora){
        NodoHora nuevaHora = new NodoHora(placa, hora);
        
        nuevaHora.setSig(ultimaHora);
        ultimaHora = nuevaHora;
        
        if (primeraHora == null) {
            primeraHora = nuevaHora;
        }
    }
    
    public void eliminarHora(String placa){
        for (NodoHora horaTemp = ultimaHora; horaTemp != null; 
                horaTemp = horaTemp.getSig()) {
            if(horaTemp.getSig().getPlaca().equals(placa)){
                horaTemp.setSig(horaTemp.getSig().getSig());
                return;
            }
        }
        System.out.println("No se encontro el vehiculo");
    }
    
}
