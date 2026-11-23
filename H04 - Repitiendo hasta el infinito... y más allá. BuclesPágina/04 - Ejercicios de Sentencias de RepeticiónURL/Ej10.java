import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int numero;
        int numerosNegativos = 0;
        int numerosPositivos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 números enteros: ");

        for (int i = 0; i < 10; i++) {
            numero = sc.nextInt();

            if (numero < 0){
                numerosNegativos++;
            } else if (numero > 0) {
                numerosPositivos++;
            }
        }

        System.out.printf("Has introducido %d positivos y %d negativos\n", numerosPositivos, numerosNegativos);

        sc.close();
    }
}
