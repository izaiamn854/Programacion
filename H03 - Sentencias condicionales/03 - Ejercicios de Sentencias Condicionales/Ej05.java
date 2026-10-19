import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;

public class Ej05 {
    public static final float G = 9.81f;
    public static void main(String[] args) {
        float h;
        float resultado;

        Scanner src = new Scanner(System.in);
        src.useLocale(Locale.US);

        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        h = src.nextFloat();

         resultado = 2 * h / G;
         System.out.printf("El objeto tarda %.2f segundos",Math.sqrt(resultado));

        src.close();
    }
}
