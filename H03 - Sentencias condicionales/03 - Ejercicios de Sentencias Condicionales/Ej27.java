import java.util.Scanner;

public class Ej27{
    public static final float PALMERA = 1.4f;
    public static final int DONUT = 1;
    public static final float PITUFO_TORTILLA = 1.6f;
    public static final float PITUFO_ACEITE = 1.2f;
    public static final float ZUMO = 1.5f;
    public static final float CAFE = 1.2f;

    public static void main(String[] args){
        float precioTotal = 0;
        float bebida = 0;
        String comer;
        String beber;

        Scanner lectura = new Scanner(System.in);

        System.out.printf("¿Que a tomado de comer? (palmera, donut o pitufo): ");
        comer = lectura.nextLine();
        switch (comer){
            case "palmera":
                comer = "Palmera";
                precioTotal = PALMERA;
                break;
            case "donut":
                comer = "Donut";
                precioTotal = DONUT;
                break;
            case "pitufo":
                System.out.printf("¿con qué se ha tomado el pitufo? (aceite o tortilla): ");
                comer = lectura.nextLine();
                switch (comer){
                    case "tortilla":
                        precioTotal = PITUFO_TORTILLA;
                        comer = "Pitufo con tortilla";
                        break;
                    case "aceite":
                        precioTotal = PITUFO_ACEITE;
                        comer = "Pitufo con aceite";
                        break;
                }
                break;
        }

        System.out.printf("¿Que a tomado de beber? (zumo o café): ");
        beber = lectura.nextLine();
        switch (beber) {
            case "café":
                beber = "Café";
                bebida = CAFE;
                break;
            case "zumo":
                beber = "Zumo";
                bebida = ZUMO;
                break;
        }

        System.out.printf("%s: %.2f €\n",comer,precioTotal);
        System.out.printf("%s: %.2f €\n",beber,bebida);

        precioTotal += bebida;

        System.out.printf("Total desayuno: %.2f €\n",precioTotal);

        lectura.close();
    }
}