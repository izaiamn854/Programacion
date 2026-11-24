import java.util.Scanner;

public class Main {

    private static final int N = 7;

    public static void main(String[] args) {
        int[][] panel = new int [N][N];

        Scanner sc = new Scanner(System.in);


        inicializar(panel);
        mostrarPanel(panel);

        sc.close();
    }

    public static void inicializar(int[][] panel) {
        for (int f = 0; f < panel.length; f++) {
            for (int c = 0; c < panel[f].length; c++) {
                panel[f][c] = 0;
            }
        }
    }
    public static void establecerEstadoInicial(int[][] panel) {
        int f = (int)Math.floor(Math.random() * N);
        int c = (int)Math.floor(Math.random() * N);

    }

    public static void mostrarPanel(int[][] panel) {
        System.out.print("    ");
        for (int f = 0; f < panel.length; f++) {
            System.out.printf("%d ",f);
        }
        System.out.print("\n  +-");
        for (int f = 0; f < panel.length; f++) {
            System.out.print("--");
        }
        for (int f = 0; f < panel.length; f++) {
            System.out.printf("\n%d | ",f);
            for (int c = 0; c < panel[f].length; c++) {
                System.out.printf("%d ", panel[f][c]);
            }
        }
        System.out.println();
    }

    public static void pulsarCelda(int fila, int columna,int[][] panel) {
        for (int i = 0; i < N; i++) {
            panel[fila][i] = (panel[fila][i] == 2)?0:panel[fila][i]+1;
        }
        for (int i = 0; i < N; i++) {
            if (i != fila) {
                panel[i][columna] = (panel[i][columna] +1)%3;
            }
        }

    }
}