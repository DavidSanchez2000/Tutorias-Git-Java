//Programa que muestra un saludo distinto según la hora introducida
import java.util.*;
public class EjemploIfAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.print("Introduzca una hora (>= 0 y <= 23) ");
        hora = sc.nextInt();
        if (hora >= 0 && hora < 12){
            System.out.println("Buenos dias");
        } else if (hora >= 12 && hora < 19){
            System.out.println("Buenas tardes");
        } else if (hora >= 18 && hora < 24){
            System.out.println("Buenas noches");
        } else {
            System.out.println("La hora no es valida");
        }
         System.out.println("Hasta pronto!!!");
    }
}