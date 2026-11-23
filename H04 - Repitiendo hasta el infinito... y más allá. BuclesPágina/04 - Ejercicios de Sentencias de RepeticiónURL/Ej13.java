import  java.util.Scanner;
public class Ej13 {
    public static final String NEGRITA = "\033[1m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) {
        int numero;
        int divisor = 1;
        int resultado = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número entero: ");
        numero = sc.nextInt();

        while (resultado != 0){
            divisor++;
            resultado =  numero % divisor;
        }
        if (numero == divisor){
            System.out.printf("El numero %ses primo%s",NEGRITA,RESET);
        } else {
            System.out.printf("El numero %sno es primo%s",NEGRITA,RESET);
        }
        sc.close();
    }
}
