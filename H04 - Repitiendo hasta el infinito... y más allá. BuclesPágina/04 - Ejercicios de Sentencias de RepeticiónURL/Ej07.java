import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        int numero = 0;
        int divisor = 0;
        float total = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números negativos.");

        while (numero >= 0){
            numero = sc.nextInt();
            if (numero >= 0) {
                total += numero;
                divisor++;
            }
        }

        total /= divisor;

        System.out.printf("La media de los números introducidos es %f", total);
        sc.close();
    }
}
