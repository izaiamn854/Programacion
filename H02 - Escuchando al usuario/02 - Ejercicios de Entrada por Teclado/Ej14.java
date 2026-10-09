import java.util.Scanner;
import java.util.Locale;

public class Ej14 {
    public static void main(String[] args) {
        float distancia;
        float consumo;
        float precio;
        float litros;
        float coste;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Coste del viaje");
        System.out.println("---------------");

        System.out.print("Distancia que va recorrer (Km): ");
        distancia = entrada.nextFloat();
        
        System.out.print("Consumo medio del vehiculo (1/100km): ");
        consumo = entrada.nextFloat();

        System.out.print("Precio del combusible (l/€): ");
        precio = entrada.nextFloat();

        litros = distancia * consumo / 100;
        coste = litros * precio;

        System.out.printf("Combustible necesario: %.2f litros\n",litros);
        System.out.printf("Coste de viaje: %.2f €",coste);

        entrada.close();
    }
}
