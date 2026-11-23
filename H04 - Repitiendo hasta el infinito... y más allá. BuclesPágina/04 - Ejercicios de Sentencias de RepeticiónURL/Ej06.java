import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        int numero;
        int numero2 = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);


        System.out.println("\033[1mNÚMEROS DE DÍGITOS DE UN NÚMERO\033[0m");
        System.out.print("Introduzca un número entero: ");
        numero = entrada.nextInt();
        numero2 = numero;

        if (numero == 0) {
            resultado++;
        } else {
            for (; numero > 0; resultado++) {
                numero = numero / 10;
            }
        }

        System.out.printf("%d tiene %d dígito/s.",numero2 ,resultado);
    }
}