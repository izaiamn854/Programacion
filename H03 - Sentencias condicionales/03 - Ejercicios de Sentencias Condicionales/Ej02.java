import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        int hora;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una hora del dia (0 - 23): ");

        hora = entrada.nextInt();

        if (hora > 5 && hora < 13) {
            System.out.println("Buenos dias");
        } else if (hora > 12 && hora < 21) {
            System.out.println("Buenas tardes");
        } else if (hora > 20 && hora < 24 || hora >= 0 && hora < 6 ){
            System.out.println("Buenas noches");
        } else {
            System.out.println("La hora introducida no es correcta.");
        }

        entrada.close();
        
    }
}
