import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int inicio;
        int fin;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: ");
        numero1 = sc.nextInt();

        System.out.print("Introduzca otro numero distinto al anterior: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2 || numero2 > numero1) {
            if (numero1 < numero2) {
                inicio = numero1;
                fin = numero2;
            } else  {
                inicio = numero2;
                fin = numero1;
            }
            for (int i = inicio; i <= fin; i+=7) {
                System.out.print(i + " ");
            }

        } else if (numero1 == numero2) {
            System.out.println("Numero no valido, deben ser distintos");
        }
        sc.close();
    }
}
