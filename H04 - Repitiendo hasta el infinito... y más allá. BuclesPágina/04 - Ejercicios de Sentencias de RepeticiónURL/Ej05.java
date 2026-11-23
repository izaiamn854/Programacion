import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args){
        int numero;
        int resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número y te mostraré su tabla de multiplicar: ");
        numero = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = i * numero;

            System.out.printf("%d x %2d = %2d\n",numero ,i ,resultado);
        }
    }
}