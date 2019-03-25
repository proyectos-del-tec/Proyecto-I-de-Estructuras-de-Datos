/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.Conductor;
import windows.*;
import models.ListaEstacionamientos;
import models.Espacio;
import models.Estacionamiento;
import models.ListaConductores;


/**
 *
 * @author Leandro Montero L
 */

public class Main {
    //Fecha de Inicio: 12/03/2019 - Fecha de Finalizacion: ?/?/?
    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    
    //DATOS POR DEFECTO
    
        //Creacion de la lista de Estacionamientos
        public static ListaEstacionamientos listadeEstacionamiento = new ListaEstacionamientos();
        public static ListaConductores listadeConductores = new ListaConductores();
        public static Conductor conductoractual;

    public static void cargarDatos(){
        listadeConductores.insertarInicio("Carlos", 123, 2340, "ABC-123");
        //Falta insertar la hora de llegada en la pila
        listadeConductores.insertarInicio("Marta", 456, 3450, "321123");
        //Falta insertar la hora de llegada en la pila
        listadeConductores.insertarInicio("Ana", 567, 6780, "DFG-321");
        //Falta insertar la hora de llegada en la pila
        listadeConductores.insertarInicio("Javier", 789, 8900, "ABC-123");
        //Falta insertar la hora de llegada en la pila
        listadeConductores.insertarInicio("Fabiola", 901, 9010, "ABD-223");
    }     
        
        
        
    //Constructor del Main    
    public static void main(String[] args) {
        cargarDatos();
        
        Principal ventanaPrincipal= new Principal();
        ventanaPrincipal.setVisible(true);
    }
   
    
}

//Cosas por hacer. 
//Andrey 24/03/19
//1. Verificacion del conductor si se encuentra o no en la lista.
//2. Crear sistema de entrada de hora y de salida.
//3. Labels de ventana de conductor y administrador.