import java.util.Scanner;

public class Edad {
     public static void main(String[] args) {

        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es tu edad?");

        edad = entrada.nextInt();

        if ( edad <= 17) {
            System.out.println("Eres menor de edad.");
        } else if ( edad <= 66) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Estas jubilado.");
        }
        entrada.close();
    }
}
