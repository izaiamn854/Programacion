import java.util.Scanner;

public class Ej10 {

    public static final int DIA_SEGUNDOS = 86400;
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;

        Scanner src = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        horas = src.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = src.nextInt();

        segundos = DIA_SEGUNDOS - (60 * (minutos + (60 * horas)));

        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos",horas,minutos,segundos);

        src.close();
    }
}
