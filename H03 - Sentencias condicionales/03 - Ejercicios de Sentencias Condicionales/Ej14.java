import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int contador = 0;
        char respuesta;

        Scanner input = new Scanner(System.in);

        System.out.println("\033[0;1mTEST DE FIDELIDAD\033[0;0m");
        System.out.println("===================\n");
        System.out.println("Este programa te dirá si hay posibilidad de que tu pareja te esté siendo infiel.\n");
        System.out.println("\n1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n2. Ha aumentado sus gastos de vestuario.");
        System.out.printf("(\nv)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n3. Ha perdido su interés que mostraba anteriormente por ti.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n4. Ahora se afeita y asea con más frecuencia  (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n5. No te deja que mires la agenda de su teléfono móvil.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n6. A veces tiene llamadas que dice no querer contestar cuando estás.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n9. Has notado que últimamente se perfuma más.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        System.out.println("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.printf("\n(v)erdadero o (f)also: ");
        respuesta = input.nextLine().charAt(0);
        if (respuesta == 'v'){
            contador += 3;
        }
        if (contador >= 0 && contador <= 10){
            System.out.println("\n¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (contador >= 11 && contador <= 22){
            System.out.println("\nQuizás exita el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.No bajes la guardia.");
        } else if (contador >= 23 && contador <= 30){
            System.out.println("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo está pasando por su cabeza.");
        }
        input.close();
    }
}