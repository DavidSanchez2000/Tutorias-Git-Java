package myProject;

import java.util.*;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        int notas = sc.nextInt();

        if (notas < 0 || notas > 10 ) {
            System.out.println("Nota no valida");

        } else if (notas < 5) {
            System.out.println("¡Suspendido!");
        } else if (notas >= 5 && notas <6){
            System.out.println("¡Suficiente!");
        } else if (notas >= 6 && notas <7){
            System.out.println("¡Bien!");
        } else if (notas >= 7 && notas <9){
            System.out.println("¡Notable!");
        } else if (notas >= 9 && notas<10){
            System.out.println("¡Sobresaliente!");
        } else if (notas == 10) {
            System.out.println("Matricula de Honor");
        } else if (notas < 0 || notas > 10 ){
            System.out.println("Nota no valida");
        }

    }
}