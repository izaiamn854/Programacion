import java.util.Scanner;
import java.util.Locale;

public class Ej28 {
    public static void main(String[] args) {
        String articulo;
        float precioProducto;
        int cantidad;
        char fiesta;
        float descuento;
        int porcentajeDescuento;
        float iva;
        int ivaTicket;
        float precioFinal;

        if (cantidad <= 0){
            System.out.println("No compro ningun articulo");
        } else {
            if (cantidad <= 3) {
                descuento = 0,05f;
                porcentajeDescuento = 5;
                
            } else if (cantidad <= 10) {
                descuento = 0,10f;
                porcentajeDescuento = 10;
                
            } else {
                descuento = 0,15f;
                porcentajeDescuento = 15;
            }

            if(fiesta == 'n'){
                iva = 0,21f;
                ivaTicket = 21;
            } else if(fiesta == 's') {
                iva = 0,16f;
                ivaTicket = 16;
            } else {
                System.out.println("Dato erroneo");
                System.exit(0);
            }
            descuento = precioProducto * descuento;
            iva = iva * precioFinal;

            precioFinal = (cantidad * precioProducto) - descuento;
            //precioFinal = (cantidad * precioProducto) - (descuento * cantidad);

            System.out.println("Factura");
            System.out.println("========================================");
            System.out.printf("Articulo\t\t%s\n",articulo);
            System.out.printf("Precio\t\t%.2f €/unidad\n",precioProducto);
            System.out.printf("Cantidad\t\t%d\n",cantidad);
            System.out.printf("Descuento (%d%%)\t\t-%.2f €\n",porcentajeDescuento ,descuento);
            System.out.printf("Subtotal con descuento\t\t%.2f €\n",precioFinal);
            System.out.printf("IVA (%d%%)\t\t+%.2f €\n",iva);
            System.out.println("========================================");
            System.out.printf("Total\t\t+%.2f €\n",precioFinal + iva);
            



        }

    }
}
