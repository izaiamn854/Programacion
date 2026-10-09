import java.util.Scanner;
import java.util.Locale;

public class Ej03 {
    public static void main(String[] args) {
        float euros;
        float pesetas = 166.3f;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Introduzca la cantidad de euros que quieres convertir: ");
        euros = entrada.nextFloat();
        System.out.printf("%.2f euros son %.0f pesetas",euros,euros*pesetas);

        entrada.close();
    }  
}
