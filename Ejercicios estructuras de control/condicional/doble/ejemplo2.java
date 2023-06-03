import java.util.*;

public class numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numeros = sc.nextInt();

        if (numeros % 2 == 0) {
            System.out.println("¡es numero par!");
        } else {
            System.out.println("¡es impar!");
        }
    }
}