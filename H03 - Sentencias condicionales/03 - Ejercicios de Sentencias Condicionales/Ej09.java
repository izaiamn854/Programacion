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
        
        if (dia < 1) {
            System.out.println("Datos incorrectos");
        } else if (dia >= 21 && mes == 3 && dia < 32 || dia <= 19 && mes == 4) {
            System.out.println("Su horóscopo es aries.");            
        } else if (dia >= 20 && mes == 4 && dia < 31 || dia <= 20 && mes == 5) {
            System.out.println("Su horóscopo es tauro.");
        } else if (dia >= 21 && mes == 5 && dia < 32 || dia <= 20 && mes == 6) {
            System.out.println("Su horóscopo es géminis.");
        } else if (dia >= 21 && mes == 6 && dia < 31|| dia <= 22 && mes == 7) {
            System.out.println("Su horóscopo es cáncer.");
        } else if (dia >= 23 && mes == 7 && dia < 32 || dia <= 22 && mes == 8) {
            System.out.println("Su horóscopo es leo.");
        } else if (dia >= 23 && mes == 8 && dia < 32 || dia <= 22 && mes == 9) {
            System.out.println("Su horóscopo es virgo.");
        } else if (dia >= 23 && mes == 9 && dia < 31 || dia <= 22 && mes == 10) {
            System.out.println("Su horóscopo es libra.");
        } else if (dia >= 23 && mes == 10 && dia < 31 || dia <= 21 && mes == 11) {
            System.out.println("Su horóscopo es escorpio.");
        } else if (dia >= 22 && mes == 11 && dia < 31 || dia <= 21 && mes == 12) {
            System.out.println("Su horóscopo es sagitario.");
        } else if (dia >= 22 && mes == 12 && dia < 32 || dia <= 19 && mes == 1) {
            System.out.println("Su horóscopo es capricornio.");
        } else if (dia >= 20 && mes == 1 && dia < 32 || dia <= 18 && mes == 2) {
            System.out.println("Su horóscopo es acuario.");
        } else if (dia >= 19 && mes == 2 && dia < 29 || dia <= 20 && mes == 3) {
            System.out.println("Su horóscopo es piscis.");
        } else {
            System.out.println("Datos incorrectos");
        }

        src.close();
    }
}
