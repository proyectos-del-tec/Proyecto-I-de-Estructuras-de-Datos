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
public class ListaConductores {
    //Lista Circular
    Conductor primerConductor;

    public ListaConductores() {
        this.primerConductor=null;
    }
    //METODO DE INSERCION
    public void insertarInicio(String Nombre,int Cedula,int Telefono,
            String Placa){
        Conductor nc= new Conductor(Nombre,Cedula,Telefono,Placa);
        if(primerConductor == null){
            primerConductor=nc;
            primerConductor.sig=primerConductor; 
        }
        else{
            nc.sig= primerConductor;
            Conductor temp= primerConductor;
            do{
                temp=temp.sig;
            }while(temp.sig!=primerConductor);
            temp.sig=nc;
            primerConductor=nc;
        }
    }
    //METODO DE MODIFICACION
    
    //METODO DE ELIMINACION
    
    //METODO DE MOSTRAR
    public void MostrarConductores(){
        if(primerConductor == null){
            return;
        }
        else{
            Conductor temp = primerConductor;
            do{
               System.out.println(temp.Nombre);
               temp = temp.sig;
            }while(temp != primerConductor);
        }
    }
    public boolean buscarConductor(int cedulaConductor){
        if(primerConductor == null){
            return false;
        }else{
            Conductor conTemp = primerConductor;
            do{
               if(conTemp.Cedula == cedulaConductor){
                   return true;
               }else{
                   conTemp = conTemp.sig;       
               }
            }while(conTemp != primerConductor);
            return false;
        }
    }
   
    
}
