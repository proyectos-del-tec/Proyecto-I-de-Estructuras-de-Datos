/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.SimpleDateFormat;
//import java.util.Locale;

/**
 *
 * @author Andrey M
 */
public class ConsultasCodigo {

    public ConsultasCodigo() {
    }
    
    
    public String obtenerDiferenciaDeHoras(String horaEntrada, String horaSalida){
        String[] horasMinutosDeEntrada = horaEntrada.split(":");
        int horasEntrada = Integer.parseInt(horasMinutosDeEntrada[0]); 
        int minutosEntrada = Integer.parseInt(horasMinutosDeEntrada[1]); 
        
        String[] horasMinutosDeSalida = horaSalida.split(":");
        int horasSalida = Integer.parseInt(horasMinutosDeSalida[0]); 
        int minutosSalida = Integer.parseInt(horasMinutosDeSalida[1]); 
        
        int diferenciaHoras = horasSalida - horasEntrada;
        int diferenciaMinutos;
        
        if(minutosSalida >= minutosEntrada){
            diferenciaMinutos = minutosSalida - minutosEntrada;  
        }else{
            diferenciaMinutos = minutosSalida - minutosEntrada + 60;
            diferenciaHoras--;
        }
        
        if(diferenciaMinutos < 10){
            return Integer.toString(diferenciaHoras) + ":0" + 
                    Integer.toString(diferenciaMinutos);
        }else{
            return Integer.toString(diferenciaHoras) + ":" + 
                    Integer.toString(diferenciaMinutos);
        }
        
    }
    
    public int pasarHoraAMinutos(String hora){
        String []horaFragmentada = hora.split(":");
        int horaEnMinutos = Integer.parseInt(horaFragmentada[0])*60 +
                Integer.parseInt(horaFragmentada[1]);
        return horaEnMinutos;
    }
    
    public String pasarMinutosAHoras(int minutos){
        int horas = 0;
        for(; minutos > 59; horas++){
            minutos = minutos - 60;                        
        }
        if(minutos < 10){
            return Integer.toString(horas) + ":0" + Integer.toString(minutos);
        }else{
            return Integer.toString(horas) + ":" + Integer.toString(minutos);
        }
    }
    
    public String obtenerTiempoPromedioEstanciaVehiculos(ColaDeHoras entradas,
            ColaDeHoras salidas){
        int sumatHorasEstVehiculos = 0; 
        int cantVehiculos = 0;
        
        for (NodoHora entTemp = entradas.getUltimaHora(); entTemp != null;
                entTemp = entTemp.getSig()) {
        
            for (NodoHora salTemp = salidas.getUltimaHora(); salTemp != null;
                    salTemp = salTemp.getSig()) {
                if(entTemp.getPlaca().equals(salTemp.getPlaca())){
                    sumatHorasEstVehiculos += pasarHoraAMinutos(
                            obtenerDiferenciaDeHoras(entTemp.getHora(), 
                                    salTemp.getHora()));
                    cantVehiculos ++;
                }
            }
        }
        return pasarMinutosAHoras(sumatHorasEstVehiculos / cantVehiculos);
    }
    
    
}
