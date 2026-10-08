import java.util.Scanner;

public class Rango {
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        
         System.out.printf("Dame un número del 1 al 100");
         numero = entrada.nextInt();

         if(numero >= 1 && numero <= 100){
            System.out.printf("Muy bien!");
         } else {
            System.out.println("No es lo que te pedi!");
         }


         entrada.close();

    }
}
