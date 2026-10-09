import java.util.Scanner;
import java.util.Locale;

public class Ej15 {
    public static void main(String[] args) {
        float importe;
        float propina;
        float personas;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Cuenta restaurante");
        System.out.println("------------------");
        System.out.print("Importe de la cuenta (€): ");
        importe = entrada.nextFloat();
        System.out.print("Propina (%%): ");
        propina = entrada.nextFloat();
        propina = importe * propina / 100;
        System.out.print("Numero de personas: ");
        personas = entrada.nextFloat();
        System.out.printf("Propina: %.2f €\n",propina);
        System.out.printf("Total: %.2f €\n",importe + propina);
        System.out.printf("Cada persona debe pagar: %.2f €",(importe + propina)/personas);
    
        entrada.close();
    }
}
