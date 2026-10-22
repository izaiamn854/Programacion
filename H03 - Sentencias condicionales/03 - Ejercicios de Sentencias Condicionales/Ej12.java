import  java.util.Scanner;

public class Ej12 {
    public static final String NEGRITA = "\033[0,1m";
    public static final String RESET = "\033[0m"; 
    public static void main(String[] args) {
        int numero;
        int restoDivisionDos;
        int restoDivisionCinco;

        Scanner src = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        numero = src.nextInt();

        restoDivisionDos = numero % 2;
        restoDivisionCinco = numero % 5;

        if (restoDivisionDos == 0) {
            if (restoDivisionCinco == 0) {
                System.out.printf("El número introducido es %spar%s y %sdivisible%s entre 5.", NEGRITA, RESET, NEGRITA, RESET);
            } else {
                System.out.printf("El número introducido es %spar%s y %sno es%s divisible entre 5.", NEGRITA, RESET, NEGRITA, RESET);
            }
            
        } else if (restoDivisionCinco == 0) {
            System.out.printf("El número introducido es %simpar%s y %sdivisible%s entre 5.", NEGRITA, RESET, NEGRITA, RESET);
        } else {
            System.out.printf("El número introducido es %simpar%s y %sno es%s divisible entre 5.", NEGRITA, RESET, NEGRITA, RESET);
        }

        src.close();
    }
}
