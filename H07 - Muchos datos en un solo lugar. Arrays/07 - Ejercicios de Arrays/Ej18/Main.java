import java.util.Scanner;

public class Main {

    private static final int N = 11;

    public static void main(String[] args) {
        int[] valor = new int[N];
        int nuevo;
        int posicion;

        Scanner leer = new Scanner(System.in);

        setValor(valor);
        arrayOriginal(valor);

        System.out.print("Introduzca el número que quiere insertar: ");
        nuevo = leer.nextInt();
        System.out.print("Introduzca la posicion donde lo quiere insertar: ");
        posicion = leer.nextInt();

        insertarArray(valor, nuevo, posicion);
        arrayResultado(valor);

        leer.close();
    }

    public static void setValor(int[] valor) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) (Math.random() * 201);
        }
    }

    public static void arrayOriginal(int[] valor) {
        System.out.println("Array original");
        System.out.print("Índice ");
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("%5d",i);
        }
        System.out.println();
        System.out.print("Valor  ");
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("%5d",valor[i]);
        }
        System.out.println();
    }

    public static void insertarArray(int[] valor,int nuevo, int posicion) {
        valor[posicion] = nuevo;
    }

    public static void arrayResultado(int[] valor) {
        System.out.println("Array resultado");
        System.out.print("Índice ");
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("%5d",i);
        }
        System.out.println();
        System.out.print("Valor  ");
        for (int i = 0; i < valor.length; i++) {
            System.out.printf("%5d",valor[i]);
        }
        System.out.println();
    }
}