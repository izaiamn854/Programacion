import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce 8 números, pulse INTRO después de cada  número: ");
        for(int i=0;i<numeros.length;i++){

            numeros[i] = leer.nextInt();

        }
        System.out.println();

        for (int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
                System.out.printf("%d par",numeros[i]);
            } else {
                System.out.printf("%d impar",numeros[i]);
            }
            System.out.println();
        }
        leer.close();
    }
}