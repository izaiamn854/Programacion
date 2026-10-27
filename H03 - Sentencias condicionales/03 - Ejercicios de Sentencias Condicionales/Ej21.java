import java.util.Scanner;
import java.util.Locale;


public class Ej21 {
    public static void main(String[] args) {
        float baseImponible;
        float iva = 0;
        float descuento = 0;
        String tipoIva;
        String tipoDescuento;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.printf("Introduzca la base imponible: ");
        baseImponible = sc.nextFloat();
        System.out.printf("Introduzca el tipo de iva(general, reducido o superreducido: ");
        tipoIva = sc.next();
        System.out.printf("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        tipoDescuento = sc.next();
        System.out.printf("Base imponible%18.2f%n",baseImponible);
        switch (tipoIva) {
            case "general":
                tipoIva = "21";
                iva = 21;
                break;
            case "reducido":
                tipoIva = "10";
                iva = 10;
                break;
            case "superreducido":
                tipoIva = "4";
                iva = 4;
                break;
            default:
                System.out.printf("Dato incorrecto");
                System.exit(0);
        }
        iva = baseImponible * iva / 100;
        System.out.printf("IVA (%s%%)%23.2f%n",tipoIva,iva);
        baseImponible = baseImponible + iva;
        System.out.printf("Precio con IVA%18.2f%n",baseImponible);
        switch (tipoDescuento){
            case "nopro":
                break;
            case "mitad":
                descuento = baseImponible * 50 / 100;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = baseImponible * 5 / 100;
                break;
            default:
                System.out.printf("Dato incorrecto");
                System.exit(0);
        }
        descuento = descuento * -1;
        System.out.printf("Cod. promo. (%s):%12.2f%n",tipoDescuento,descuento);
        baseImponible = baseImponible + descuento;
        System.out.printf("\033[1;100mTOTAL:%26.2f\033[0m%n",baseImponible);
        sc.close();
    }
}