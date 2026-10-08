public class Ej01 {
    public static void main(String[] args) {
        String linea;
        int a;
        int b;

        System.out.print("Este programa multiplica numeros entero.\n");
        System.out.print("Por favor, introduzca el primer numero: ");
        linea = System.console().readLine();
        a = Integer.parseInt(linea);
        System.out.print("Introduzca el segundo numero: ");
        linea = System.console().readLine();
        b = Integer.parseInt(linea);
        System.out.printf("%d * %d = %d",a,b,a*b);


        
    }
}
