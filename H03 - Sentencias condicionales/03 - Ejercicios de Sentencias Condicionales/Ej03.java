import java.util.Scanner;

public class Ej03 {
    public static final int SUELDO_BASE = 12;
    public static final int SUELDO_EXTRA = 16;
    public static final int TIEMPO_COMPLETO = 40; 
    public static void main(String[] args) {
        int horas;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");

        horas = entrada.nextInt();

        if (horas < 40) {

            System.out.printf("El sueldo semanal que le corresponde es de %d euros",horas * SUELDO_BASE);

        } else {
            System.out.printf("El sueldo semanal que le corresponde es de %d euros",(TIEMPO_COMPLETO * SUELDO_BASE) + ((horas - TIEMPO_COMPLETO) * SUELDO_EXTRA));
        }
        entrada.close();
    }
    
}
