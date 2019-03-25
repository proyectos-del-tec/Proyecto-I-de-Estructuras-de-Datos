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
public class Estacionamiento {
   //Lista Doble
    String Nombre;
    int EspaciosDiscapacitados;
    int EspaciosMotos;
    int EspaciosVehiculosOrdinarios;
    int EspaciosVehiculosOficiales;
    Espacio primerEspacio;
    Estacionamiento sig;
    
    
    public Estacionamiento(String Nombre,int EspaciosDiscapacitados, int EspaciosMotos, int EspaciosVehiculosOrdinarios, int EspaciosVehiculosOficiales) {
        this.Nombre=Nombre;
        this.EspaciosDiscapacitados = EspaciosDiscapacitados;
        this.EspaciosMotos = EspaciosMotos;
        this.EspaciosVehiculosOrdinarios = EspaciosVehiculosOrdinarios;
        this.EspaciosVehiculosOficiales = EspaciosVehiculosOficiales;
        this.primerEspacio= null;
        this.sig=null;
    }

    
    //Metodos Get and Set
    public int getEspaciosDiscapacitados() {
        return EspaciosDiscapacitados;
    }

    public void setEspaciosDiscapacitados(int EspaciosDiscapacitados) {
        this.EspaciosDiscapacitados = EspaciosDiscapacitados;
    }

    public int getEspaciosMotos() {
        return EspaciosMotos;
    }

    public void setEspaciosMotos(int EspaciosMotos) {
        this.EspaciosMotos = EspaciosMotos;
    }

    public int getEspaciosVehiculosOrdinarios() {
        return EspaciosVehiculosOrdinarios;
    }

    public void setEspaciosVehiculosOrdinarios(int EspaciosVehiculosOrdinarios) {
        this.EspaciosVehiculosOrdinarios = EspaciosVehiculosOrdinarios;
    }

    public int getEspaciosVehiculosOficiales() {
        return EspaciosVehiculosOficiales;
    }

    public void setEspaciosVehiculosOficiales(int EspaciosVehiculosOficiales) {
        this.EspaciosVehiculosOficiales = EspaciosVehiculosOficiales;
    }

    public Espacio getPrimerEspacio() {
        return primerEspacio;
    }

    public void setPrimerEspacio(Espacio primerEspacio) {
        this.primerEspacio = primerEspacio;
    }


    
    //METODOS DE INSERCION
    public void insertarInicio(Espacio e){
        Espacio ne= e;
        ne.setSig(primerEspacio);
        if(primerEspacio!=null){
            primerEspacio.setAnt(ne);
        }
        primerEspacio=ne;
    }
    //METODO DE ELIMINACION
    public void eliminar(int n){
        if(primerEspacio==null)
            System.out.println("No hay Espacios");
        else{
            if(primerEspacio.getNumero()==n){
                primerEspacio=primerEspacio.getSig();
                if(primerEspacio!=null)
                    primerEspacio.setAnt(null);
                else{
                    Espacio temp=primerEspacio;
                    while((temp!=null)&&(temp.getNumero()!=n)){
                        temp=temp.getSig();
                    }
                    if(temp==null)
                        System.out.println("No esta el espacio en el Estacionamiento");
                    else{
                         temp.getAnt().setSig(temp.getSig());
                         if(temp.getSig()!=null)
                             temp.getSig().setAnt(temp.getAnt());
                         }
                }
            }
        }
    }
    //METODO DE MODIFICACION
    public void modificar(int Numero,String Estado){
        Espacio EspacioRequerido=BuscarEspacio(Numero);
        if(EspacioRequerido==null)
            System.out.println("No Existe este Estacionamiento");
        else
            EspacioRequerido.setEstado(Estado);
        
        
    }

    //METODOS ALTERNATIVOS
    public Espacio BuscarEspacio(int numero){
        if(primerEspacio==null)
            return null;
        Espacio temp= primerEspacio;
        while((temp!=null)&&(temp.getNumero()!=numero))
            temp=temp.getSig();
        if(temp!=null)
            return temp;
        else
            return null;
    }       
    public void MostrarEspacios(){
        if (primerEspacio==null)
            System.out.println("No hay elementos.");
        else{
            Espacio temp=primerEspacio;
            System.out.println("Espacios Disponibles:");
            while(temp!=null){
                System.out.println("Espacio: "+temp.getNumero()+"\t");
                temp=temp.getSig();
                
            }
        }
    }
}
