import java.util.Scanner;
import java.util.Locale;

public class Ej06 {
    
    public static void main(String[] args) {
    float notaA;
    float notaB;
    float notaC;
    float notaMedia;
    
    Scanner src = new Scanner(System.in);
    src.useLocale(Locale.US);

    System.out.print("Introducir la primera nota: ");
    notaA = src.nextFloat();
    System.out.print("Ahora introduzca la segunda nota: ");
    notaB = src.nextFloat();
    System.out.print("Por último introduzca la tercera nota: ");
    notaC = src.nextFloat();
    
    notaMedia = (notaA + notaB + notaC) / 3;

    System.out.printf("La media es %.2f",notaMedia);

    src.close();
    }
}
