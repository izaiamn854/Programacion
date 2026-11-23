import  java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int numero;
        int numero2;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero positivo entero: ");
        numero = sc.nextInt();
        if (numero > 0) {
            numero2 = numero + 1;
            resultado = numero;

            for (int i = 1; i <= 99; i++) {
                resultado += numero2;

                numero2++;
            }

            System.out.printf("La suma de los 100 numeros siguientes a %d es %d", numero, resultado);
        } else {
            System.out.print("Numero introducio incorrecto, debe introducir un numero positivo.\n");
        }
        sc.close();
    }
}
