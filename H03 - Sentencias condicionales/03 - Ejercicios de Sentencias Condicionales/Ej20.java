import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        String dia;
        int hora;
        int minuto;
        int minutoHora;
        int minutoTotal;
        int minutosFinSemana = 0;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca un día de semana (de lunes a viernes): ");
        dia = sc.nextLine();

        System.out.println("A continuación introduzca la hora (hora y minutos)");

        System.out.printf("Hora: ");
        hora = sc.nextInt();

        System.out.printf("Minutos: ");
        minuto = sc.nextInt();

        switch (dia) {
            case "lunes":
                minutosFinSemana = 6600;
                break;
            case "martes":
                minutosFinSemana = 5220;
                break;
            case "miercoles":
                minutosFinSemana = 3780;
                break;
            case "jueves":
                minutosFinSemana = 2340;
                break;
            case "viernes":
                minutosFinSemana = 900;
                break;
            default:
                System.out.println("Día no válido");
        }
        minutoHora = (hora * 60) + minuto;
        minutoTotal = minutosFinSemana - minutoHora;

        System.out.printf("Faltan %d minutos para llegar al fin de semana.", minutoTotal);

        sc.close();
    }
}