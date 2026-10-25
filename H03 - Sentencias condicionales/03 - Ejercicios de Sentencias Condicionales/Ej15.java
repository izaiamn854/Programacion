import  java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int entero;
        int ultimo;

        Scanner src = new Scanner(System.in);

        System.out.print("Introduce el ultimo número entero: ");
        entero = src.nextInt();

        ultimo = entero % 10;

        System.out.printf("El último digito del número introducido es el %d%n",ultimo);

        src.close();
    }
}
