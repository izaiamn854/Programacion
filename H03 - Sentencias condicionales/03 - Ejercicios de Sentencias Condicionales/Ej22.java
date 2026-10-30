import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        float sueldoBase = 0;
        float sueldoBruto = 0;
        float sueldoNeto = 0;
        float irpf = 0;
        float dietas = 0;
        int viajes = 0;
        int cargoEmpleado = 0;
        int estadoCivil = 0;
        int irpfPorcentaje = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.printf("Introduzca el cargo del empleado (1 - 3): ");
        cargoEmpleado = sc.nextInt();
        System.out.printf("¿Cuantos dias ha estado de viaje visitando clientes?: ");
        viajes = sc.nextInt();
        System.out.printf("1 - Soltero, 2 - Casado): ");
        estadoCivil = sc.nextInt();

        switch (cargoEmpleado) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
        }
        dietas = viajes * 30;
        sueldoBruto = sueldoBase + dietas;
        switch (estadoCivil) {
            case 1:

                irpf = 25 * sueldoBruto / 100;
                irpfPorcentaje = 25;
                break;
            case 2:
                irpf = 20 * sueldoBruto / 100;
                irpfPorcentaje = 20;
                break;
        }

        sueldoNeto = sueldoBruto - irpf;
        System.out.println("");
        System.out.println("------------------------------");
        System.out.printf("|Sueldo Base%17.2f|\n",sueldoBase);
        System.out.printf("|Dieta (%d viajes)%12.2f|\n",viajes,dietas);
        System.out.println("------------------------------");
        System.out.printf("|Sueldo Bruto%16.2f|\n",sueldoBruto);
        System.out.printf("|Retención IRPF (%d%%)%8.2f|\n",irpfPorcentaje,irpf);
        System.out.println("------------------------------");
        System.out.printf("|Sueldo Neto%17.2f|\n",sueldoNeto);
        System.out.println("------------------------------");

    }
}