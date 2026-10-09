import java.util.Scanner;
import java.util.Locale;

public class Ej10 {
    public static void main(String[] args) {
        float precio;
        float iva;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Introduzca la base imponible (precio del articulo sin IVA): ");
        precio = entrada.nextFloat();

        iva = precio * 0.21f;

        System.out.printf("Base imponible\t%10.2f €\n",precio);
        System.out.printf("IVA (21%%)\t%10.2f €\n",iva);
        System.out.println("----------------------------");
        System.out.printf("Total\t\t%10.2f €",precio + iva);
        entrada.close();
    }
}
