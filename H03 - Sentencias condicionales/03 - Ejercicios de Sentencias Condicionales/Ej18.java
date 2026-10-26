import java.util.Scanner;
public class Ej18 {
    public static final String NEGRITA = "\033[0;1m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        String numeroOriginal;
        String numeroInvertido;

        Scanner input = new Scanner(System.in);



        System.out.printf("Introduce el numero de entero(de 5 cifras como máximo): ");
        numeroOriginal = input.nextLine();

        StringBuilder sb = new StringBuilder(numeroOriginal);
        numeroInvertido = sb.reverse().toString();

        if (numeroOriginal.equals(numeroInvertido)){
            System.out.printf("El número introducido %ses capicúa.%s", NEGRITA, RESET);
        } else {
            System.out.printf("El número introducido %sno es%s capicúa.", NEGRITA, RESET);
        }
    }
}