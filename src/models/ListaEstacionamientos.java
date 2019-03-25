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
public class ListaEstacionamientos {
  //Esta clase es una lista simple.
    Estacionamiento primerEstacionamiento;

    public ListaEstacionamientos() {
        this.primerEstacionamiento = null;
    }
    
    //METODOS DE INSERCION O MODIFICACION
    public void InsertarFinal(Estacionamiento e){
        //if(buscar(nombre)==true){
            //System.out.println("El usuario ya esta introducido");
            //return;
        //}
        Estacionamiento ne = e;
        
        if(primerEstacionamiento==null)
            primerEstacionamiento=ne;
        else{
            Estacionamiento temp=primerEstacionamiento;
            while(temp.sig!=null)
                temp=temp.sig;
            temp.sig=ne;
        }
    }
    public void ModificarNombreEst(String nombre,String nombrenuevo){

        Estacionamiento temp =primerEstacionamiento;
        while(temp!=null){
            if(temp.Nombre.equals(nombre)){
                temp.Nombre=nombrenuevo;
            }
            temp=temp.sig;    
        }   
    }
    
    
    
    public void ModificarCantidadEst(String nombre, int numero){
                Estacionamiento temp =primerEstacionamiento;
        while(temp!=null){
            if(temp.Nombre.equals(nombre)){
                temp.EspaciosVehiculosOrdinarios=numero;
            }
            temp=temp.sig;    
        }
        
    }
    
    
    
    
    //METODOS DE BORRADO
    public void BorrarEstacionamiento(String nombre){
        if(primerEstacionamiento == null)
            return;
        else if(primerEstacionamiento.Nombre.equals(nombre)){
            primerEstacionamiento=primerEstacionamiento.sig;
        }
        else{
            Estacionamiento ant=null;
            Estacionamiento temp=primerEstacionamiento;
            while(temp!=null){
                if(temp.Nombre.equals(nombre)){
                    ant.sig=temp.sig;
                    return;
                }
                ant=temp;
                temp=temp.sig;
            }
        System.out.println("No se encontro el Estacionamiento\n");
        }
    }
    
    //METODOS ALTERNATIVOS
    public Estacionamiento BuscarEstacionamiento(String n){
        Estacionamiento temp =primerEstacionamiento;
        while(temp!=null){
            if(temp.Nombre.equals(n)){
                return temp;
            }
            temp=temp.sig;
            
            
        }
        return null;
        
    }    
    
    public void MostrarEstacionamientosActuales(){
        if(primerEstacionamiento==null){
            System.out.println("No hay clientes en la lista");
            return;
        }
        else{
            Estacionamiento temp = primerEstacionamiento;
            while(temp!=null){
                System.out.println("Nombre: "+temp.Nombre);
                temp= temp.sig;
            }
            System.out.println("Todos los estacionamientos anteriores son los registrados.");
        }
    }
}
