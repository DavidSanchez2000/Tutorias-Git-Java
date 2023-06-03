//Escriba un programa que lee dos números por teclado y los muestra por pantalla.

import java.util.*;

public class Secuencial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;
        System.out.println("Introduce el primer numero:");
        numero1 = sc.nextFloat();
        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextFloat();

        System.out.println("Los numeros introducidos son: " + numero1 + " y " + numero2);


    }
}
        