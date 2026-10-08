import java.util.Scanner;

public class Formas {
    public static void main(String[] args) {
        int option;
        float base;
        float altura;


        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        option = entrada.nextInt();

        switch (entrada) {

            case 1:

                System.out.println();
                base = entrada.nextInt();

                System.out.println();

                break;

            case 2:
                
                System.out.println();
                base = entrada.nextInt();

                System.out.println();
                altura = entrada.nextInt();

                System.out.println();

                break;
            case 3:
                System.out.println();
                base = entrada.nextInt();

                System.out.println();
                altura = entrada.nextInt();

                System.out.println();
                break;
            default:
                System.out.println("Error opcion de menu incorrecta");
                break;
        }
        entrada.close();
    }
}
