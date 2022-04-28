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
public final class Lavadora extends Electrodomestico {
    private Float carga;

    public Lavadora() {
    }

    public Lavadora(Float carga) {
        this.carga = carga;
    }

    public Lavadora(Float carga, Float precio, String color, Character consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }
    
    //METODOS
    
    public void CrearLavadora(){
        super.CrearElectrodomestico();
        System.out.print("Ingrese la carga máxima de la lavadora: ");
        carga=leer.nextFloat();
    }
    
    @Override
    public void PrecioFinal(){
        super.PrecioFinal();
        //SEGÚN LA CAPACIDAD MÁXIMA DE CARGA SE LE SUMA UN EXTRA O NO
        if(carga>30){
            precio+=500f;
        }
    }
    
}
