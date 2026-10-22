import java.util.Scanner;

public class Ej10 {


    public static final String NEGRITA = "\033[0;1m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) {
        char respuesta;
        int puntos = 0;

        Scanner src = new Scanner(System.in);

        System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión");
        System.out.println("\ta. int");
        System.out.println("\tb. double");
        System.out.println("\tc. float");
        System.out.print("=>");
        respuesta = src.nextLine().charAt(0);

        if (respuesta == 'b') {
            System.out.println("Correcto");
            puntos += 2;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println();
        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las base de datos");
        System.out.println("\ta. XML");
        System.out.println("\tb. SELECT");
        System.out.println("\tc. SQL");
        System.out.print("=>");
        respuesta = src.nextLine().charAt(0);

        if (respuesta == 'c') {
            System.out.println("Correcto");
            puntos += 2;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println();
        System.out.println("3. Para insertar un hyperenlace en una página se utiliza la etiqueta...");
        System.out.println("\ta. href");
        System.out.println("\tb. a");
        System.out.println("\tc. link");
        System.out.print("=>");
        respuesta = src.nextLine().charAt(0);

        if (respuesta == 'b') {
            System.out.println("Correcto");
            puntos += 2;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println();
        System.out.println("4. ¿En que directorio se encuentran los archivos de configuracion de Linux?");
        System.out.println("\ta. /etc");
        System.out.println("\tb. /config");
        System.out.println("\tc. /cfg");
        System.out.print("=>");
        respuesta = src.nextLine().charAt(0);

        if (respuesta == 'a') {
            System.out.println("Correcto");
            puntos += 2;
        } else {
            System.out.println("Incorrecto");
        }        

        System.out.println();
        System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("\ta. RAM");
        System.out.println("\tb. EPROM");
        System.out.println("\tc. ROM");
        System.out.print("=>");
        respuesta = src.nextLine().charAt(0);

        if (respuesta == 'a') {
            System.out.println("Correcto");
            puntos += 2;
        } else {
            System.out.println("Incorrecto");
        } 

        System.out.println();
        System.out.printf("Ha optenido %s%d puntos%s",NEGRITA,puntos,RESET);
        System.out.println();

        src.close();
    }
}
