/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/
package ejercicio_herencia_03;

import ejercicio_herencia_03.Entidades.Electrodomestico;
import ejercicio_herencia_03.Entidades.Lavadora;
import ejercicio_herencia_03.Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_Herencia_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se creará una lista con 4 electrodomésticos y se calculará el precio total, de los 4 y por tipo.");
        ArrayList<Electrodomestico> Electrodomesticos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //SE AGREGAN 4 ELECTRODOMÉSTICOS AL ARRAYLIST
        for (int i = 0; i < 4; i++) {
            int op;
            do {                
                System.out.println("\nElija el tipo de electrodoméstico que quiere ingresar."
                        + "\n1- Lavadora."
                        + "\n2- Televisor.");
                System.out.print("Opción: ");
                op=leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("\nLavadora:");
                        Lavadora lavadora = new Lavadora();
                        lavadora.CrearLavadora();
                        Electrodomesticos.add(lavadora);
                        System.out.println("Se agregó una lavadora a la lista.");
                        break;
                    case 2:
                        System.out.println("\nTelevisor:");
                        Televisor televisor = new Televisor();
                        televisor.CrearTelevisor();
                        Electrodomesticos.add(televisor);
                        System.out.println("Se agregó un televisor a la lista.");
                        break;
                    default:
                        System.out.println("Opción no valida.");
                }
            } while (op!=1 &&op!=2);
            
        }
        
        int precioTotal=0,precioLavadoras=0,precioTelevisores=0;
        
        //SE CALCULA LOS PRECIOS FINALES
        for (Electrodomestico aux : Electrodomesticos) {
            if (aux instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) aux;
                lavadora.PrecioFinal();
                precioLavadoras+=lavadora.getPrecio();
            }
            if (aux instanceof Televisor) {
                Televisor televisor = (Televisor) aux;
                televisor.PrecioFinal();
                precioTelevisores+=televisor.getPrecio();
            }
            precioTotal+=aux.getPrecio();
        }
        
        System.out.println(""
                + "\nPrecio final de lavadoras: $"+precioLavadoras+""
                + "\nPrecio final de televisores: $"+precioTelevisores+""
                + "\nPrecio final de electrodomésticos: $"+precioTotal);
    }
    
}
