import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int total = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce el exponente máximo: ");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            total *= base;

            System.out.printf("%d^%d = %d\n",base ,i , total);
        }
        sc.close();
    }
}
