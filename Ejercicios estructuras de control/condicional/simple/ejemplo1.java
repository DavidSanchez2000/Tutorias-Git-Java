package myProject;

import java.util.*;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        int nota = sc.nextInt();

        if (nota >= 5) {
            System.out.println("¡Aprobado!");
        } else {
            System.out.println("¡Suspendido!");
        }
    }
}
