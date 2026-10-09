import java.util.Scanner;
import java.util.Locale;

public class Ej05 {
    public static void main(String[] args) {
        float Mb;
        float Kb = 1024;
        
        Scanner Entrada = new Scanner(System.in);
        Entrada.useLocale(Locale.US);

        System.out.print("Introduzca el numero de Mb: ");
        Mb = Entrada.nextFloat();

        System.out.printf("%.1f Mb son %.1f Kb",Mb ,Mb * Kb);

        Entrada.close();
    }
}
