import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        char relleno = sc.next().charAt(0);

        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= (2 * fila - 1); i++) {
                System.out.print(relleno);
            }

            System.out.println();
        }

        sc.close();
    }
}