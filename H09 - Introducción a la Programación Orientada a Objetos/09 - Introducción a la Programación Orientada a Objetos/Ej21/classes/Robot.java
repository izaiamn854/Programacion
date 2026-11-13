
package classes;

public class Robot {

    // ATRIBUTOS
    private String identificador;
    private String nombre;
    private int bateria;

    // CONSTRUCTOR
    public Robot(String identificador, String nombre, int bateria) {
        this.identificador = identificador;
        this.nombre = nombre;

        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            this.bateria = 50;
        }
    }

    // GETTERS
    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBateria() {
        return bateria;
    }

    // SETTER
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    // RECARGAR
    public int recargar() {
        bateria += 20;

        if (bateria > 100) {
            bateria = 100;
        }

        return bateria;
    }

    // MOSTRAR ESTADO DE LA BATERIA
    public void estadoBateria() {

        System.out.print("[");

        for (int i = 0; i < 10; i++) {

            if (i < bateria / 10) {
                System.out.print("#");
            } else {
                System.out.print("-");
            }
        }

        System.out.println("] " + bateria + "%");
    }

    // LIMPIAR ZONAS
    public int limpiar(int zonas) {

        if (zonas <= 0) {
            System.out.println("Error: el numero de zonas debe ser positivo.");
            return 0;
        }

        int zonasLimpiadas = 0;

        while (zonasLimpiadas < zonas && bateria >= 15) {

            bateria -= 15;
            zonasLimpiadas++;

            System.out.println("Zona " + zonasLimpiadas + " limpiada correctamente.");
        }

        System.out.println("Zonas limpiadas: " + zonasLimpiadas);
        System.out.println("Bateria restante: " + bateria + "%");

        if (zonasLimpiadas < zonas) {
            System.out.println("Bateria insuficiente para continuar.");
        }

        return zonasLimpiadas;
    }

    // MOSTRAR INFORMACION
    public void mostrarInformacion() {

        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Bateria: " + bateria + "%");
    }
}
