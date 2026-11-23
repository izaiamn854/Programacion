import  java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.println("  n  |  n2  |   n3");
        System.out.println("---------------------");

        for (int i = 0; i <= 4; i++) {
            System.out.printf("  %d |  %d |  %d\n", numero, numero * numero, numero * numero * numero);
            numero++;
        }

        sc.close();
    }
}
