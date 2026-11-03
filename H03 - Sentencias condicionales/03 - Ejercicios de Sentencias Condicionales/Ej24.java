import java.util.Scanner;

public class Ej24 {
    public static final float PRECIO_ENTRADA = 8f;
    public static final float PRECIO_PAREJA = 11f;
    public static final float PRECIO_MIERCOLES = 5f;
    public static final float DESCUENTO = 0.1f;


    public static void main(String[] args) {
        int numeroEntradas = 0;
        int numeroImpares = 0;
        String dia;
        char tarjetaCineCampa;
        float precioTotal = 0f;
        float descuentoTotal = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Venta de entradas CineTuring");
        System.out.printf("Número de entradas: ");
        numeroEntradas = sc.nextInt();
        System.out.printf("Día de la semana: ");
        dia = sc.next();
        System.out.printf("¿Tienes tarjeta de CineCampa? (s/n): ");
        tarjetaCineCampa = sc.next().charAt(0);
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        switch (dia) {
            case "miercoles":
                System.out  .printf("Entradas individuales%d\n", numeroEntradas);
                System.out.printf("Precio por entrada individual%.2f €\n",PRECIO_MIERCOLES);
                precioTotal = PRECIO_MIERCOLES * numeroEntradas;
                break;
            case "jueves":
                numeroImpares = numeroEntradas % 2;
                numeroEntradas /= 2;

                System.out.printf("Entradas de pareja%d\n", numeroEntradas);
                if(numeroImpares == 1){
                    System.out.printf("Entradas individuales%d\n", numeroImpares);
                }
                System.out.printf("Precio por entrada pareja%.2f €\n",PRECIO_PAREJA);
                if(numeroImpares == 1){
                    System.out.printf("Precio por entrada individual%.2f €\n",PRECIO_ENTRADA);
                    precioTotal = PRECIO_ENTRADA;
                }
                precioTotal = precioTotal + (PRECIO_PAREJA * numeroEntradas);
                break;
            default:
                System.out  .printf("Entradas individuales%d\n", numeroEntradas);
                System.out.printf("Precio por entrada individual%.2f €\n",PRECIO_ENTRADA);
                precioTotal = PRECIO_ENTRADA * numeroEntradas;
                break;
        }

        System.out.printf("total%.2f\n", precioTotal);
        if (tarjetaCineCampa == 's'){
            descuentoTotal = DESCUENTO * precioTotal;
        }
        System.out.printf("Descuento %.2\nf", descuentoTotal);
        precioTotal = precioTotal - descuentoTotal;
        System.out.printf("A pagar %.2f\n", precioTotal);

        sc.close();
    }
}