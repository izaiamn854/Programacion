import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int altura;
        int ancho;
        char relleno;


        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        relleno = sc.next().charAt(0);

        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                System.out.print(" ");
            }
            ancho = fila * 2 - 1;
            for (int i = 1; i <= ancho; i++) {
                if (i == 1 || i == ancho || fila == altura){
                    System.out.print(relleno);
                } else  {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}