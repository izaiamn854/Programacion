import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        int horas;
        int sueldoBase = 12;
        int sueldoExtra = 16;
        int tiempoCompleto = 40;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");

        horas = entrada.nextInt();

        if (horas < 40) {

            System.out.printf("El sueldo semanal que le corresponde es de %d euros",horas * sueldoBase);

        } else {
            System.out.printf("El sueldo semanal que le corresponde es de %d euros",(tiempoCompleto * sueldoBase) + ((horas - tiempoCompleto) * sueldoExtra));
        }
        entrada.close();
    }
    
}
