/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_03.Entidades;

/**
 *
 * @author Walter
 */
public final class Televisor extends Electrodomestico {
    private Float resolucion;
    private Boolean sintonizadorTDT;
    
    public Televisor(){
    }

    public Televisor(Float resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Float resolucion, Boolean sintonizadorTDT, Float precio, String color, Character consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Float getResolucion() {
        return resolucion;
    }

    public void setResolucion(Float resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //METODOS
    
    public void CrearTelevisor(){
        super.CrearElectrodomestico();
        do{            
            System.out.print("Ingrese el tamaño en pulgadas del televisor: ");
            resolucion=leer.nextFloat();
            if(resolucion<0){
                System.out.println("La resolución no puede ser cero wey.");
            }
        }while (resolucion<0);
        boolean continuar=false;
        do {            
            System.out.print("¿El televisor tiene un sintonizador TDT?(s/n) ");
            String respuesta=leer.next();
            switch (respuesta) {
                case "s":
                    sintonizadorTDT=true;
                    break;
                case "n":
                    sintonizadorTDT=false;
                    break;
                default:
                    continuar=true;
                    System.out.println("Ingreso no valido.");
            }
        } while (continuar);
    }
    
    @Override
    public void PrecioFinal(){
        super.PrecioFinal();
        //SEGÚN LA RESOLUCIÓN SE LE SUMA UN EXTRA AL PRECIO
        if(resolucion>40){
            precio+=precio*0.30f;
        }
        //SEGÚN SI TIENE O NO UN SINTONIZADOR TDT SE LE SUMA UN EXTRA O NO
        if(sintonizadorTDT){
          precio+=500f;  
        }
    }
}
