import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int numeroEntero;
        int numeroDigito;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el numero de entero(de 5 cifras como máximo): ");
        numeroEntero = input.nextInt();

        numeroDigito = String.valueOf(Math.abs(numeroEntero)).length();

        System.out.printf("El numero introducio tiene %d dígitos\n", numeroDigito);

        input.close();
    }
}