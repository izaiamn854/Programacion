import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner entrada = new Scanner(System.in);

        System.out.println("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introducir valor de a: ");
        a = entrada.nextFloat();

        System.out.print("Introducir valor de b: ");
        b = entrada.nextFloat();
        
        if (a == 0 && b == 0) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        } else if (a == 0) {
            System.out.println("Esta ecuación no tiene solución real.");
        } else {
            System.out.printf("x = %.1f",-b/a);
        }
    }
    
}
