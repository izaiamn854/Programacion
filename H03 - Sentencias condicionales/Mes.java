import  java.util.Scanner;

public class Mes {
     public static void main(String[] args) {

        int mes;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Que dia del mes?");

        mes = entrada.nextInt();

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

