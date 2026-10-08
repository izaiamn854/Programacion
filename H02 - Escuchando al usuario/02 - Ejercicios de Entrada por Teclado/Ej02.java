public class Ej02 {
    public static void main(String[] args) {
        String linea;
        int a;
        int b = 12;

        System.out.print("Introduzca el numero de horas que trabaja durante la semana: ");
        linea = System.console().readLine();
        a = Integer.parseInt(linea);
        System.out.printf("Su salario semanal es de %d euros",a*b);
    }
}
