import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;


public class Ej11 {
    public static void main(String[] args) {
        float altura;
        float base;
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        
        System.out.print("Introduzca la altura (cm): ");
        altura = entrada.nextFloat();

        System.out.print("Introduzca el radio de la base (cm): ");
        base = entrada.nextFloat();

        System.out.printf("El volumen del cono es de %f",1f/3f * Math.PI * base * base*altura);

        entrada.close();
    }
}
