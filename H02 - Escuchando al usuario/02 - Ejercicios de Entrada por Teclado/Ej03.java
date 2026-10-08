import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        float euros;
        float pesetas = 166.3f;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de euros que quieres convertir: ");
        euros = entrada.nextFloat();
        System.out.printf("%.2f euros son %.0f",euros,euros*pesetas);

        entrada.close();

    }


    
}
