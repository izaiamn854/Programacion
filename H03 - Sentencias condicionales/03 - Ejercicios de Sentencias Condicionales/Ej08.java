import java.lang.Math;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int discriminante;
        double x1;
        double x2;

        Scanner src = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax² + bx + c = 0");
        System.out.println("Introduce los valores:");
        System.out.print("a = ");
        a = src.nextInt();
        System.out.print("b = ");
        b = src.nextInt();
        System.out.print("c = ");
        c = src.nextInt();



        if (a == 0 && b == 0 && c == 0) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        } else {
            discriminante = (b * b) - (4 * a * c); 

            if (discriminante < 0) {
                System.out.println("No tiene soluciones reales");
            } else {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.printf("x1 = %.1f%n",x1);
                System.out.printf("x2 = %.1f",x2);
            }    
        }
        src.close();
    }
}
