import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {

        String dia;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un día de la semana y te diré qué asignatura toca a primera hora del día: ");

        dia  = entrada.next();

        switch (dia) {
            case "Lunes":

                System.out.println( "Sostenibilidad Aplicada al Sistema Productivo");      

                break;

            case "Martes":

                System.out.println( "	Itinerario Personal para la Empleabilidad I");
                
                break;

            case "Miercoles":
                System.out.println( "	Bases de Datos");

                break;

            case "Jueves":

                System.out.println( "	Itinerario Personal para la Empleabilidad I");

                break;

            case "Viernes":

                System.out.println( "Programacion");
                
                break;

            case "Sabado":

                System.out.println( "Fin de semana no hay clase");

                break;

            case "Domingo":

                System.out.println( "Fin de semana no hay clase");

                break;

            default:

                System.out.println( "El dia introducido no es correcto");

                break;
        }
        
    }
}