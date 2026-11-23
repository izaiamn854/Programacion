import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de potencia");
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente = sc.nextInt();

        if (exponente == 0) {
            total = 1;
        } else if (exponente > 0) {
            total = base;
            for (int i = 1; i <= exponente -1; i++) {
                total *= base;
            }
        }
        System.out.printf("%d^%d = %d",base ,exponente ,total);

    }
}
