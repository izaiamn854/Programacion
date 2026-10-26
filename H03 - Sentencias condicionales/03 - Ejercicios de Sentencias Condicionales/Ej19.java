import java.util.Scanner;
import java.util.Locale;

public class Ej19 {
    public static void main(String[] args) {
        float PrimeraNota;
        float SegundaNota;
        float mediaNota;
        String respuesta;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.printf("Nota del primer examen: ");
        PrimeraNota = input.nextFloat();

        System.out.printf("Nota del segunda examen: ");
        SegundaNota = input.nextFloat();

        mediaNota = (PrimeraNota + SegundaNota)/2 ;

        if (PrimeraNota >= 5) {
            System.out.printf("Tu nota en programación es %.1f\n", mediaNota);
        } else {
            System.out.printf("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            respuesta = input.next();
            if (respuesta.equalsIgnoreCase("apto")) {
                System.out.printf("Tu nota en programación es 5\n", mediaNota);
            } else {
                System.out.printf("Tu nota en programación es %.1f\n", mediaNota);
            }
        }

        input.close();
    }
}