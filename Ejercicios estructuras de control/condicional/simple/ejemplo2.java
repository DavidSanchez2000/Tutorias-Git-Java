/*
 * Mostrar la suma, resta y multiplicación de dos valores
 * de tipo double que se introducen por teclado.
 */

/* ejemplo 2
Ingresar el sueldo anual de una persona, si supera los 53.206.000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
*/

import java.util.*;
public class Secuencial2  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el sueldo anual del persona:");
        int sueldo = sc.nextInt();
        if (sueldo >= 53206000)
            System.out.println("Esta persona debe pagar impuestos");
        System.out.println("Hasta pronto");
    }
}