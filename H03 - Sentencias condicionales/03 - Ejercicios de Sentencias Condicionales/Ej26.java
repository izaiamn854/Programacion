import java.util.Scanner;

public class Ej26 {

    public static final String PAPEL = "papel";
    public static final String TIJERA = "tijera";
    public static final String PIEDRA = "piedra";
    public static void main(String[] args) {
        String inputJugador1;
        String inputJugador2;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Turno del jugador 1(Introduzca piedra, papel o tijera): ");
        inputJugador1 = sc.nextLine();

        System.out.printf("Turno del jugador 2(Introduzca piedra, papel o tijera): ");
        inputJugador2 = sc.nextLine();

        if(inputJugador1.equals(PAPEL) && inputJugador2.equals(PIEDRA) || inputJugador1.equals(TIJERA) && inputJugador2.equals(PAPEL) || inputJugador1.equals(PIEDRA) && inputJugador2.equals(TIJERA)){
            System.out.println("Gana Jugador 1");
        } else if (inputJugador2.equals(PAPEL) && inputJugador1.equals(PIEDRA) || inputJugador2.equals(TIJERA) && inputJugador1.equals(PAPEL) || inputJugador2.equals(PIEDRA) && inputJugador1.equals(TIJERA)){
            System.out.println("Gana Jugador 2");
        } else if (inputJugador1.equals(inputJugador2)) {
            System.out.println("Empate");
        } else {
            System.out.println("Error uno de los Jugadores se equivoco al escribir.");
        }

        sc.close();

    }
}