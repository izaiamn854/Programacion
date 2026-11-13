import classes.Robot;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // CREACION DE LOS ROBOTS
        Robot robot1 = new Robot("R001", "Orion", 80);
        Robot robot2 = new Robot("R002", "Atlas", 60);

        int opcion;

        do {

            System.out.println("\n===== ESTACION ESPACIAL ORION =====");
            System.out.println("1. Mostrar informacion de los robots");
            System.out.println("2. Limpiar zonas");
            System.out.println("3. Recargar bateria");
            System.out.println("4. Mostrar estado de la bateria");
            System.out.println("5. Comparar robots");
            System.out.println("6. Cambiar identificador");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = leerEntero(teclado);

            Robot robotSeleccionado;

            switch (opcion) {

                case 1:

                    System.out.println("\n--- ROBOT 1 ---");
                    robot1.mostrarInformacion();

                    System.out.println("\n--- ROBOT 2 ---");
                    robot2.mostrarInformacion();

                    break;

                case 2:

                    robotSeleccionado = seleccionarRobot(teclado, robot1, robot2);

                    System.out.print("¿Cuantas zonas quieres limpiar? ");
                    int zonas = leerEntero(teclado);

                    robotSeleccionado.limpiar(zonas);

                    break;

                case 3:

                    robotSeleccionado = seleccionarRobot(teclado, robot1, robot2);

                    int nuevaBateria = robotSeleccionado.recargar();

                    System.out.println("Nueva bateria: " + nuevaBateria + "%");

                    break;

                case 4:

                    robotSeleccionado = seleccionarRobot(teclado, robot1, robot2);

                    robotSeleccionado.estadoBateria();

                    break;

                case 5:

                    System.out.println("\n--- COMPARACION DE ROBOTS ---");

                    if (robot1.getBateria() > robot2.getBateria()) {

                        System.out.println(robot1.getNombre() + " tiene mas bateria.");

                    } else if (robot2.getBateria() > robot1.getBateria()) {

                        System.out.println(robot2.getNombre() + " tiene mas bateria.");

                    } else {

                        System.out.println("Los dos robots tienen la misma bateria.");

                    }

                    System.out.println(robot1.getNombre() + ": " + robot1.getBateria() + "%");
                    System.out.println(robot2.getNombre() + ": " + robot2.getBateria() + "%");

                    break;

                case 6:

                    robotSeleccionado = seleccionarRobot(teclado, robot1, robot2);

                    System.out.print("Introduce el nuevo identificador: ");
                    String nuevoIdentificador = teclado.nextLine();

                    robotSeleccionado.setIdentificador(nuevoIdentificador);

                    System.out.println("Identificador actualizado correctamente.");

                    break;

                case 7:

                    System.out.println("Cerrando el programa...");

                    break;

                default:

                    System.out.println("Opcion no valida. Intentalo de nuevo.");

            }

        } while (opcion != 7);

        teclado.close();
    }

    // METODO PARA SELECCIONAR UN ROBOT
    public static Robot seleccionarRobot(Scanner teclado, Robot robot1, Robot robot2) {

        int seleccion;

        do {

            System.out.println("\nSelecciona el robot:");
            System.out.println("1. " + robot1.getNombre());
            System.out.println("2. " + robot2.getNombre());
            System.out.print("Opcion: ");

            seleccion = leerEntero(teclado);

            if (seleccion == 1) {

                return robot1;

            } else if (seleccion == 2) {

                return robot2;

            } else {

                System.out.println("Seleccion no valida.");

            }

        } while (true);
    }

    // METODO PARA LEER NUMEROS ENTEROS
    public static int leerEntero(Scanner teclado) {

        while (true) {

            try {

                return Integer.parseInt(teclado.nextLine());

            } catch (NumberFormatException e) {

                System.out.print("Introduce un numero entero valido: ");

            }
        }
    }
}
