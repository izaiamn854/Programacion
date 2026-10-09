import java.util.Scanner;
import java.util.Locale;

public class eJ09 {
    public static void main(String[] args) {
        float X;
        float Y;

        Scanner Entrada = new Scanner(System.in);
        Entrada.useLocale(Locale.US);

        System.out.print("Introduzca el primer numero: ");
        X = Entrada.nextFloat();

        System.out.print("Introduzca el segundo numero: ");
        Y = Entrada.nextFloat();

        System.out.printf("x = %.1f\n",X);
        System.out.printf("y = %.1f\n",Y);
        System.out.printf("x + y = %.1f\n",X + Y);
        System.out.printf("x - y = %.1f\n",X - Y);
        System.out.printf("x / y = %.17f\n",X / Y);
        System.out.printf("x * y = %.1f\n",X * Y);
        
        Entrada.close();
    }
}
