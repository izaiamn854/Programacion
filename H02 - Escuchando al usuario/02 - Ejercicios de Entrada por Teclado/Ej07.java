import java.util.Scanner;
import java.util.Locale;

public class Ej07 {
public static void main(String[] args) {
    float Base;
    float Altura;
    
    Scanner Entrada = new Scanner(System.in);
    Entrada.useLocale(Locale.US);

    System.out.println("Area de un rectangulo");

    System.out.println("---------------------");

    System.out.print("Introduzca la longitud de la base (cm): ");
    Base = Entrada.nextFloat();

    System.out.print("Introduzca la altura (cm): ");
    Altura = Entrada.nextFloat();

    System.out.printf("El area de un rectangulo es %.1f Cm²",Altura * Base);

    Entrada.close();
}
    
}
