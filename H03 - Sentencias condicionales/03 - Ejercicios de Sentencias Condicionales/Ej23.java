import java.util.Scanner;
import java.util.Locale;

public class Ej23 {
    public static final float PRECIO_ESCUDO_BORDADO = 2.5F;
    public static final float PRECIO_ENVIO = 3.25F;
    public static final int PRECIO_CENTIMETRO_CUADRADO = 1;
    public static final String NEGRITA_FONDO_GRIS = "\033[1;30;47m" ;
    public static final String RESET = "\033[0m" ;

    public static void main(String[] args) {
    int altura;
    int ancho;
    int cmCuadrados;
    float precioFinal;
    char opcion;

    Scanner leer = new Scanner(System.in);
    leer.useLocale(Locale.US);

    System.out.printf("Introduzca la altura de la bandera en cms: ");
    altura = leer.nextInt();
    System.out.printf("Ahora introduzca la altura: ");
    ancho = leer.nextInt();
    System.out.printf("¿Quiere escudo bordado? (s/n): ");
    opcion = leer.next().charAt(0);

    cmCuadrados = altura * ancho;
    precioFinal = 0.01f * cmCuadrados;

    System.out.println("Gracias. Aquí tiene el desgloce de su compra.");
    System.out.printf("Bandera de %d cm²:%5.2f €\n", cmCuadrados, precioFinal);
    if (opcion == 's') {
        System.out.printf("Con escudo:%13.2f €\n",PRECIO_ESCUDO_BORDADO);
        precioFinal += PRECIO_ESCUDO_BORDADO;
    } else if (opcion == 'n') {
        System.out.printf("Sin escudo:%13.2f €\n",0f);
    }

    precioFinal += PRECIO_ENVIO;
    System.out.printf("Gastos de envío:%8.2f €\n",PRECIO_ENVIO);

    System.out.printf("%sTotal:%18.2f €%s",NEGRITA_FONDO_GRIS,precioFinal,RESET);
    }
}