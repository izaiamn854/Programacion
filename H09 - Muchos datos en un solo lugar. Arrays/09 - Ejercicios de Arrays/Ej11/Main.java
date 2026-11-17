import java.util.Scanner;

public class Main {
    private static final int N = 100;
    public static void main(String[] args) {
        int[] numeros = new int[N];
        int numeroRemplazar;
        int numeroNuevo;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int)(Math.random()*21);
            if (i != numeros.length-1){
                System.out.printf("%d ",numeros[i]);
            } else{
                System.out.printf("%d\n",numeros[i]);
            }

        }
        System.out.println();

        System.out.print("Introduce un numero de los que se han mostrado: ");
        numeroRemplazar = leer.nextInt();
        System.out.print("Introduce el valor por el que quieres sustiturilo: ");
        numeroNuevo = leer.nextInt();
        System.out.println();
        for (int i = 0; i < numeros.length ; i++) {

            if (numeroRemplazar == numeros[i]){
                numeros[i] = numeroNuevo;
                System.out.printf("\"%d\" ",numeros[i]);
            }  else{
                System.out.printf("%d ",numeros[i]);
            }
        }

    }
}