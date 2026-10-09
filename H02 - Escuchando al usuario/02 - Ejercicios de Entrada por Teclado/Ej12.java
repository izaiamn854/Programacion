import java.util.Scanner;
import java.util.Locale;

public class Ej12 {
    
    public static void main(String[] args) {
    
        float nota1;
        float nota2;
        float notaT;

        Scanner entrada = new  Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Introduzca la nota del primer examen:" );
        nota1 = entrada.nextFloat();

        System.out.print("Que nota quiere sacar en el trimestre? ");
        notaT = entrada.nextFloat();

        nota2 = (notaT - (nota1 * 0.4f))/0.6f;

        System.out.printf("Para sacar un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.",notaT ,nota2);
        
        entrada.close();
    }
}
