import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int numero;
        int totalNumeros = 0;
        int mediaImpares = 0;
        int maximoPar = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo numeros enteros.");
        System.out.println("Puede terminar mediante la introduccion de un numero negativo.");

        for (int i = 1; i > 0; i = numero) {
            numero = sc.nextInt();
            if (numero > 0) {
                if (numero % 2 == 0) {
                    if (numero > maximoPar) {
                        maximoPar = numero;
                    }
                }else {
                    mediaImpares += numero;
                }
                totalNumeros++;
            }
        }
        System.out.printf("Ha introducido %d numeros positivos\n", totalNumeros);
        System.out.printf("La media de los impares es %d\n", mediaImpares/2);
        System.out.printf("El maximo de los pares es %d\n", maximoPar);

        sc.close();
    }
}
