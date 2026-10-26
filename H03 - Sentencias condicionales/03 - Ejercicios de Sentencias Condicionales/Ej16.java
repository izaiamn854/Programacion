import  java.util.Scanner;

public class Ej16 {


    public static void main(String[] args) {
        char numeroEntero;
        int primerNumero;

        Scanner src = new Scanner(System.in);

        System.out.print("Introduce un número entero(de 5 cifrascomo máximo): ");
        numeroEntero = src.nextLine().charAt(0);
        primerNumero = Character.getNumericValue(numeroEntero);


        System.out.printf("El primer digito del número introducido es el %d.%n",primerNumero);

        src.close();
    }

}
