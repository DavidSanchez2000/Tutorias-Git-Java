/*
 * Mostrar la suma, resta y multiplicación de dos valores
 * de tipo double que se introducen por teclado.
 */

/* ejemplo 2
Escriba un programa programa que lee por teclado dos valores de tipo double y a continuación muestra su suma, resta y multiplicación.
*/

import java.util.*;
public class Secuencial2  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Introduce el primer numero:");
        numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextDouble();
        System.out.println("Numeros introducido:" + numero1  + " " + numero2);
        System.out.println("suma:" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println("resta:" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println("producto:" + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
    }
}