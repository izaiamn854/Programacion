import java.util.Scanner;
import java.util.Locale;

public class Ej04 {
    public static void main(String[] args) {
        float pesetas;
        float euros = 166.3f;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Introduzca la cantidad de pesetas que quieres convertir: ");
        pesetas = entrada.nextFloat();
        System.out.printf("%.0f pesetas son %.2f euros",pesetas,pesetas/euros);

        entrada.close();
    }  
}
