import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;
public static final String[] DIA = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
public class Main {
    public static void main(String[] args) {
        float[] semana;

        semana = new float[7];

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        try {

            leervector(semana);
            mostrarvector(semana);

            System.out.printf("La media es %.2f",media(semana));
        }catch(InputMismatchException ime){
            System.out.println("**Error**");
        }
    }
}

public static void leervector(float[] vector, Scanner entrada){
    for(int i = 0; i < vector.length; i++){
        System.out.printf("Introduce una temperatura de %s: ", DIA[i]);
        vector[i] = entrada.nextFloat();
    }
}
public static void mostrarvector(float[] vector){
    System.out.print("[");
    for(int i = 0; i < vector.length; i++){
        System.out.printf(" %.2f ",vector[i]);
        if(i != vector.length - 1){
            System.out.print("|");
        }
    }
    System.out.print("]");
}
public static float media(float[] vector){
    float media = 0;
    for(int i = 0; i < vector.length; i++){
        media += vector[i];
    }
    return media/vector.length;
}