import java.util.Scanner;
public class Main {
    private static final int N = 12;
    private static final String[] MESES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    public static void main(String[] args) {
        int[] temperatura = new int[N];

        Scanner sc = new Scanner(System.in);

        leerTemperatura(temperatura,sc);
        mostrarGrafica(temperatura);

        sc.close();
    }
    private static void leerTemperatura(int[] temperatura, Scanner sc) {
        for (int i = 0; i < temperatura.length ; i++) {
            System.out.printf("Introducir la temperatura media de %s: ", MESES[i]);
            temperatura[i] = sc.nextInt();
        }
        System.out.println();
    }
    private static void mostrarGrafica(int[] temperatura) {
        for (int i = 0; i < temperatura.length ; i++) {
            System.out.printf("%10s |", MESES[i]);
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("\u2584");
            }
            System.out.printf(" %dºC\n", temperatura[i]);
        }
    }
}