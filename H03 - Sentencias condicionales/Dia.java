import java.util.Scanner;

public class Dia {

    public static void main(String[] args) {
        int dia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime el dia de la semana (1-7): ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");

            System.out.println("Martes");

            System.out.println("Miercoles");

            System.out.println("Jueves");

            System.out.println("Viernes");

            System.out.println("Sabado");

            System.out.println("Domingo");

            System.out.println("El valor debe estar entre 1 y 7");
        }

        entrada.close();
    }
}
