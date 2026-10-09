import java.util.Scanner;
import java.util.Locale;

public class Ej06 {
    public static void main(String[] args) {

        float Kb;
        float Mb = 1024;

        Scanner Entrada = new Scanner(System.in);
        Entrada.useLocale(Locale.US); 

        System.out.print("Introduzca el numero de Kb: ");
        Kb = Entrada.nextFloat();

        System.out.printf("%.1f Kb son %.1f Mb",Kb ,Kb/Mb);
        
        Entrada.close();
    }
}
