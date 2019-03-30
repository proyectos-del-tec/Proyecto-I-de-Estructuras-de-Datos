package main;
import models.Administrador;
import models.ColaDeHoras;
import models.Conductor;
import windows.*;
import models.ListaEstacionamientos;
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

    public static ListaEstacionamientos listadeEstacionamiento = new ListaEstacionamientos();
    public static ListaConductores listadeConductores = new ListaConductores();
    public static Conductor conductoractual;
    public static Administrador admin;
    public static ColaDeHoras horasDeEntrada = new ColaDeHoras();
    public static ColaDeHoras horasDeSalida = new ColaDeHoras();    

    public static void cargarDatos(){
        
        
        admin = new Administrador("123", "123");
        
        listadeConductores.insertarInicio("Carlos", 123, 2340, "ABC-123");
        horasDeEntrada.agragarNuevaHora("ABC-123", "6:30");
        listadeConductores.insertarInicio("Marta", 456, 3450, "321123");
        horasDeEntrada.agragarNuevaHora("321123", "9:21");
        listadeConductores.insertarInicio("Ana", 567, 6780, "DFG-321");
        horasDeEntrada.agragarNuevaHora("DFG-321", "13:13");
        listadeConductores.insertarInicio("Javier", 789, 8900, "ABC-123");
        horasDeEntrada.agragarNuevaHora("ABC-123", "14:11");
        listadeConductores.insertarInicio("Fabiola", 901, 9010, "ABD-223");
        horasDeEntrada.agragarNuevaHora("ABD-223", "8:56");
        
        listadeEstacionamiento.InsertarFinal(
                new Estacionamiento("Bromelia", 2, 1, 19, 3));
        listadeEstacionamiento.InsertarFinal(
                new Estacionamiento("Concha", 2, 3, 15, 2));
        listadeEstacionamiento.InsertarFinal(
                new Estacionamiento("Talamasoa", 2, 2, 12, 3));
        listadeEstacionamiento.InsertarFinal(
                new Estacionamiento("Nivel 1", 2, 2, 7, 2));
        listadeEstacionamiento.InsertarFinal(
                new Estacionamiento("Nivel 2", 2, 2, 19, 1));
   
    }
    
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