import java.util.Scanner;
import java.util.Locale;

public class Ej28 {
    public static void main(String[] args) {
        String articulo;
        float precioProducto = 0f;
        int cantidad = 0;
        char fiesta;
        float descuento = 0f;
        int porcentajeDescuento = 0;
        float iva = 0f;
        int ivaTicket = 0;
        float precioFinal = 0f;

        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        System.out.printf("Introduzca nombre del artículo: ");
        articulo = leer.nextLine();

        System.out.printf("Introduzca el precio del artículo: ");
        precioProducto = leer.nextFloat();

        System.out.printf("Introduzca el número de unidades vendidas: ");
        cantidad = leer.nextInt();

        System.out.printf("¿Aplicamos descuento en IVA por fiesta? (s/n): ");
        fiesta = leer.next().charAt(0);

        if (cantidad <= 0){
            System.out.println("No compro ningun articulo");
        } else {

            if (cantidad <= 3) {
                descuento = 0.05f;
                porcentajeDescuento = 5;
                
            } else if (cantidad <= 10) {
                descuento = 0.10f;
                porcentajeDescuento = 10;
                
            } else {
                descuento = 0.15f;
                porcentajeDescuento = 15;
            }

            descuento *= precioProducto;

            descuento *= -1;


            if(fiesta == 'n'){
                iva = 0.21f;
                ivaTicket = 21;
            } else if (fiesta == 's'){
                iva = 0.16f;
                ivaTicket = 16;
            } else {
                System.out.println("Dato erroneo");
                System.exit(0);
            }

            precioFinal = (cantidad * precioProducto) + descuento;
            //precioFinal = (cantidad * precioProducto) + (descuento * cantidad);

            iva *= precioFinal;

            System.out.println("Factura");
            System.out.println("========================================");
            System.out.printf("Articulo%32s\n",articulo);
            System.out.printf("Precio%25.2f €/unidad\n",precioProducto);
            System.out.printf("Cantidad%32d\n",cantidad);
            System.out.printf("Descuento (%d%%)%+24.2f €\n",porcentajeDescuento ,descuento);
            System.out.printf("Subtotal con descuento%16.2f €\n",precioFinal);
            System.out.printf("IVA (%d%%)%+29.2f €\n",ivaTicket,iva);
            System.out.println("========================================");
            precioFinal += iva;
            System.out.printf("Total%33.2f €\n",precioFinal);
            
        leer.close();
        }

    }
}
