import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        int mes;
        int dia;
        
        Scanner src = new Scanner(System.in);
        
        System.out.println("Este programa te dirá cuál es tu horóscopo.");
        System.out.print("Introduce el número del mes en que nació (1-12): ");
        mes = src.nextInt();
        System.out.print("Ahora introduce el día: ");
        dia = src.nextInt();
        
        if (dia <= 21 && mes == 3|| dia >= 19 && mes == 4) {
            System.out.println("Su horóscopo es aries.");            
        } else if (dia <= 20 && mes == 4 || dia > 20 && mes == 5) {
            
        }
        
        src.close();
    }
}
