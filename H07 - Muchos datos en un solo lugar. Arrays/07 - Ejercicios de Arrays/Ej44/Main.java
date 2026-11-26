import java.util.Scanner;
import Clases.Bosque;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano = 0;
        boolean datoValido = false;

        System.out.printf("=== SIMULADOR DE INCENDIO FORESTAL ===%n");

        // 1. Pedir y validar tamaño del tablero (4-20)
        while (!datoValido) {
            System.out.printf("Introduce el tamaño del bosque cuadrado (4-20): ");
            try {
                tamano = Integer.parseInt(sc.nextLine());
                if (tamano >= 4 && tamano <= 20) {
                    datoValido = true;
                } else {
                    System.out.printf("Error: El tamaño debe estar entre 4 y 20.%n");
                }
            } catch (NumberFormatException e) {
                System.out.printf("Error: Debes introducir un número entero válido.%n");
            }
        }

        // 2. Crear bosque y mostrar estado inicial
        Bosque bosque = new Bosque(tamano, tamano);

        System.out.printf("%n=== INICIO DE LA SIMULACIÓN ===%n");
        System.out.printf("Leyenda: [T] Árbol (3t) | [m] Matorral (1t) | [a] Agua | [~] Cortafuegos | [^] Roca | [*] Fuego | [#] Ceniza%n%n");
        bosque.mostrarMapa();

        // 3. Pedir coordenadas de caída del rayo hasta prender una parcela combustible
        boolean incendioIniciado = false;
        while (!incendioIniciado) {
            System.out.printf("%n--- CAÍDA DEL RAYO ---%n");
            int fila = pedirCoordenada(sc, "Fila (0-" + (tamano - 1) + "): ");
            int col = pedirCoordenada(sc, "Columna (0-" + (tamano - 1) + "): ");

            if (bosque.iniciarIncendio(fila, col)) {
                incendioIniciado = true;
            } else {
                System.out.printf("Aviso: Coordenadas fuera de rango o terreno no combustible (agua, cortafuegos o roca). Prueba otra casilla.%n");
            }
        }

        // 4. Bucle de simulación ciclo a ciclo
        int ciclo = 1;
        while (bosque.contarFocosActivos() > 0) {
            System.out.printf("%n=== CICLO %d (Focos activos: %d) ===%n", ciclo, bosque.contarFocosActivos());
            bosque.mostrarMapa();

            // Mejora opcional: crear cortafuegos antes de avanzar turno
            System.out.printf("%n¿Quieres crear un cortafuegos antes de avanzar? (s/n): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                int fCorta = pedirCoordenada(sc, "Fila para cortafuegos: ");
                int cCorta = pedirCoordenada(sc, "Columna para cortafuegos: ");
                if (bosque.crearCortafuegos(fCorta, cCorta)) {
                    System.out.printf("Cortafuegos creado en (%d, %d).%n", fCorta, cCorta);
                } else {
                    System.out.printf("No se pudo crear el cortafuegos (coordenada inválida o no combustible).%n");
                }
            }

            System.out.printf("%nPulsa ENTER para avanzar ciclo...");
            sc.nextLine();

            bosque.avanzarCiclo();
            ciclo++;
        }

        // 5. Incendio extinguido e informe final
        System.out.printf("%n=== CICLO %d (Focos activos: 0 - INCENDIO EXTINGUIDO) ===%n", ciclo);
        bosque.mostrarMapa();

        System.out.printf("%n=== INFORME FINAL DEL ECOSISTEMA ===%n");
        System.out.printf("- Duración total del incendio: %d ciclos%n", ciclo);
        bosque.mostrarInformeFinal();

        sc.close();
    }

    // Método auxiliar en Main para no repetir el try-catch al pedir filas y columnas
    private static int pedirCoordenada(Scanner sc, String mensaje) {
        while (true) {
            System.out.printf("%s", mensaje);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("Error: Introduce un número entero válido.%n");
            }
        }
    }
}