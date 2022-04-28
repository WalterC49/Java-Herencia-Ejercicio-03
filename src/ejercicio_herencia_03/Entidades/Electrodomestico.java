/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_03.Entidades;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Electrodomestico {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Float precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, String color, Character consumoEnergetico, Float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    //METODOS
    
    private void ComprobarConsumoEnergetico(char letra){
        switch(letra){
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                consumoEnergetico='F';
        }
    }
    
    private void ComprobarColor(String color){
        if (color.equalsIgnoreCase("blanco")) {
            //NADA
        }else if (color.equalsIgnoreCase("negro")) {
            //NADA
        }else if (color.equalsIgnoreCase("rojo")) {
            //NADA
        }else if (color.equalsIgnoreCase("azul")) {
            //NADA
        }else if (color.equalsIgnoreCase("gris")) {
            //NADA
        }else{
            this.color="blanco";
        }
    }
    
    protected void CrearElectrodomestico(){
        precio=1000f;
        System.out.print("Ingrese el color del electrodoméstico: ");
        color=leer.next();
        System.out.print("Ingrese el consumo energético(A a F): ");
        consumoEnergetico=toUpperCase(leer.next().charAt(0));
        do{
            System.out.print("Ingrese el peso del electrodoméstico: ");
            peso=leer.nextFloat();
            if(peso<0){
                System.out.println("\nAlgo no puede pesar cero ni negativo.");
            }
        }while(peso<0);
        ComprobarConsumoEnergetico(consumoEnergetico);
        ComprobarColor(color);
    }
    
    protected void PrecioFinal(){
        //SEGÚN EL TIPO DE CONSUMO LE SUMA UN EXTRA AL PRECIO
        switch (consumoEnergetico) {
            case 'A':
                precio+=1000f;
                break;
            case 'B':
                precio+=800f;
                break;
            case 'C':
                precio+=600f;
                break;
            case 'D':
                precio+=500f;
                break;
            case 'E':
                precio+=300f;
                break;
            case 'F':
                precio+=100f;
                break;
        }
        //SEGÚN EL PESO LE SUMA UN EXTRA AL PRECIO
        if(peso>=1 &&peso<=19){
            precio+=100f;
        }else if(peso>=20 &&peso<=49){
            precio+=500f;
        }else if(peso>=50 &&peso<=79){
            precio+=800f;
        }else if(peso>=80){
            precio+=1000f;
        }
    }
    
}
