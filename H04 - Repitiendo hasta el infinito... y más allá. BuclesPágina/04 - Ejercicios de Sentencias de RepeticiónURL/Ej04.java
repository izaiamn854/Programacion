import java.util.Scanner;

public class Ej04 {
    public static final int CODIGO = 8888;

    public static void main(String[] args){
        int codigo = 0000;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++){
            System.out.print("Intronduce la clave de la caja fuere: ");
            codigo = sc.nextInt();

            if (codigo == CODIGO){
                i = 5;
            } else {
                System.out.println("Clave incorrecta");
            }
        }
        if (codigo == CODIGO){
            System.out.println("\033[1;31mSe ha abierto la caja fuerte\033[0m");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
            System.out.println("Se ha emitido un aviso a la policía");
        }
        sc.close();
    }

}