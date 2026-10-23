import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        char rellenoPiramide;
        int tipoPiramide;

        Scanner src = new Scanner(System.in);

        System.out.println("Este programa pinta una pirámide.");
        System.out.print("Introduzca el carácter de relleno: ");
        rellenoPiramide = src.nextLine().charAt(0);
        System.out.println("Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia izquierda");
        System.out.println("4. Con el vértice hacia derecha");
        System.out.print("?");
        tipoPiramide = src.nextInt();
        System.out.println();
        System.out.println("La pirámide es:");
        if (tipoPiramide == 1) {
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(1));
            System.out.printf("%4s%n", String.valueOf(rellenoPiramide).repeat(3));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(5));
        } else if (tipoPiramide == 2) {
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(5));
            System.out.printf("%4s%n", String.valueOf(rellenoPiramide).repeat(3));
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(1));
        } else if (tipoPiramide == 3) {
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(1));
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(2));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(3));
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(2));
            System.out.printf("%3s%n", String.valueOf(rellenoPiramide).repeat(1));
        } else if (tipoPiramide == 4) {
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(1));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(2));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(3));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(2));
            System.out.printf("%s%n", String.valueOf(rellenoPiramide).repeat(1));
        }
        src.close();
    }
}
