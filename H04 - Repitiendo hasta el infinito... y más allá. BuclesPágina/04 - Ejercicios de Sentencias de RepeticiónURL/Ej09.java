import  java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int numero;
        int siguiente;

        Scanner sc = new Scanner(System.in);

        System.out.println("N PRIMERO NÚMEROS DE LA SERIE DE FIBONACCI");
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print(f1 + " ");
            siguiente = f1 + f2;
            f1 = f2;
            f2 = siguiente;
        }

        sc.close();
    }
}
