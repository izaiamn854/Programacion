import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int segundos;
        int minutos;
        int horas;
        int restoSegundos;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca una cantidad en segundos: ");
        segundos = entrada.nextInt();
        
        minutos = segundos / 60;
        restoSegundos = segundos % 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        
        System.err.printf("%d segundos son %d horas, %d minutos y %d segundos",segundos , horas, minutos, restoSegundos);

        entrada.close();
    }
}
