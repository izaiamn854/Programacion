import java.util.Scanner;

public class Ej25{
    public static final int MANZANA = 18;
    public static final int FRESA = 16;
    public static final int CHOCOLATE_BLANCO = 15;
    public static final int CHOCOLATE_NEGRO = 14;
    public static final float NATA = 2.5f;
    public static final float NOMBRE = 2.75f;

    public static void main(String[] args){
        float precioTotal = 0;
        float suplementoNata = 0;
        float suplementoNombre = 0;
        String sabor;
        String opcionNata;
        String opcionNombre;

        Scanner lectura = new Scanner(System.in);

        System.out.printf("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = lectura.nextLine();
        switch (sabor){
            case "manzana":
                precioTotal = MANZANA;
                break;
            case "fresa":
                precioTotal = FRESA;
                break;
            case "chocolate":
                System.out.printf("¿Que tipo de chocolate quiere? (negro o blanco): ");
                sabor = lectura.nextLine();
                switch (sabor){
                    case "negro":
                        precioTotal = CHOCOLATE_NEGRO;
                        sabor = "chocolate negro";
                        break;
                    case "blanco":
                        precioTotal = CHOCOLATE_BLANCO;
                        sabor = "chocolate blanco";
                        break;
                }
                break;
        }

        System.out.printf("¿Quiere nata? (si o no): ");
        opcionNata = lectura.nextLine();
        if (opcionNata.equals("si")){
                suplementoNata = NATA;
        }

        System.out.printf("¿Quiere ponerle un nombre? (si o no): ");
        opcionNombre = lectura.nextLine();
        if (opcionNombre.equals("si")){
            suplementoNombre = NOMBRE;
        }

        System.out.printf("Tarta de %s: %.2f €\n",sabor,precioTotal);

        if (opcionNata.equals("si")){
            System.out.printf("Con nata: %.2f €\n",suplementoNata);
            precioTotal += suplementoNata;
        }

        if (opcionNombre.equals("si")){
            System.out.printf("Con nombre: %.2f €\n",suplementoNombre);
            precioTotal += suplementoNombre;
        }

        System.out.printf("Total: %.2f €\n",precioTotal);
        lectura.close();
    }
}