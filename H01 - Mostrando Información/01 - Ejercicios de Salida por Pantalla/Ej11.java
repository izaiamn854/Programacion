public class Ej11 {

    public static void main(String[] args) {

        // Colores

        String violeta = "\u001B[38;2;180;110;255m";
        String cian = "\u001B[38;2;80;220;255m";
        String azul = "\u001B[38;2;70;140;255m";
        String amarillo = "\u001B[38;2;255;210;60m";
        String naranja = "\u001B[38;2;255;165;60m";
        String reset = "\u001B[0m";

        // Consola
        System.out.println();
        System.out.println("     " + violeta + "████████████████████████████" + reset);
        System.out.println("   " + violeta + "████████████████████████████████" + reset);
        System.out.println("   " + violeta + "██████" + reset + cian + "████████████████████" + reset + violeta + "██████" + reset);
        System.out.println("   " + violeta + "██████" + reset + cian + "████████████████████" + reset + violeta + "██████" + reset);
        System.out.println("   " + violeta + "██████" + reset + cian + "████████████████████" + reset + violeta + "██████" + reset);
        System.out.println("   " + violeta + "██████" + reset + cian + "████████████████████" + reset + violeta + "██████" + reset);
        System.out.println("   " + violeta + "██████" + reset + cian + "████████████████████" + reset + violeta + "██████" + reset);
        System.out.println("   " + violeta + "████████████████████████████████" + reset);
        System.out.println("   " + violeta + "████████████████████████████████" + reset);
        System.out.println("   " + violeta + "██████" + reset + azul + "██" + reset + violeta + "████████████████████████" + reset);
        System.out.println("   " + violeta + "████" + reset + azul + "██████" + reset + violeta + "███████████" + reset + amarillo + "██" + reset + violeta + "█████████" + reset);
        System.out.println("   " + violeta + "██████" + reset + azul + "██" + reset + violeta + "███████████" + reset + amarillo + "██" + reset + violeta + "███████████" + reset);
        System.out.println("   " + violeta + "████████████████████████████████" + reset);
        System.out.println("   " + violeta + "██████████" + reset + naranja + "██" + reset + violeta + "███████" + reset + naranja + "██" + reset + violeta + "███████████" + reset);
        System.out.println("   " + violeta + "████████████████████████████████" + reset);
        System.out.println("     " + violeta + "████████████████████████████" + reset);
        System.out.println();
    }
}
