package Clases;

public class Bosque {
    private Parcela[][] mapa;

    public Bosque(int filas, int columnas) {
        this.mapa = new Parcela[filas][columnas];
        this.generarEcosistema();
    }

    public void generarEcosistema() {
        for (int f = 0; f < this.mapa.length; f++) {
            for (int c = 0; c < this.mapa[f].length; c++) {
                this.mapa[f][c] = new Parcela();
            }
        }
    }

    public boolean iniciarIncendio(int fila, int col) {
        boolean respuesta = false;

        if (fila >= 0 && fila < this.mapa.length &&
                col >= 0 && col < this.mapa[0].length &&
                this.mapa[fila][col].esCombustible()) {

            this.mapa[fila][col].prender();
            respuesta = true;
        }

        return respuesta;
    }
    public void avanzarCiclo() {
        // FASE 1: Propagación (marcar vecinas de las que ya arden)
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                if (this.mapa[i][j].estaArdiendo()) {
                    if (i - 1 >= 0) {                      // Norte (arriba)
                        this.mapa[i - 1][j].marcarParaArder();
                    }
                    if (i + 1 < this.mapa.length) {        // Sur (abajo)
                        this.mapa[i + 1][j].marcarParaArder();
                    }
                    if (j - 1 >= 0) {                      // Oeste (izquierda)
                        this.mapa[i][j - 1].marcarParaArder();
                    }
                    if (j + 1 < this.mapa[i].length) {     // Este (derecha)
                        this.mapa[i][j + 1].marcarParaArder();
                    }
                }
            }
        }

        // FASE 2: Desgaste (consumir combustible de las que ya ardían)
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                this.mapa[i][j].consumirTurno();
            }
        }

        // FASE 3: Actualización (prender las que fueron marcadas en la Fase 1)
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                this.mapa[i][j].aplicarSiguienteEstado();
            }
        }
    }

    public int contarFocosActivos() {
        int focos = 0;

        for (int f = 0; f < this.mapa.length; f++) {
            for (int c = 0; c < this.mapa[f].length; c++) {
                if (this.mapa[f][c].estaArdiendo()) {
                    focos++;
                }
            }
        }

        return focos;
    }

    public boolean crearCortafuegos(int fila, int columna) {
        boolean creado = false;

        if (fila >= 0 && fila < this.mapa.length &&
                columna >= 0 && columna < this.mapa[0].length &&
                this.mapa[fila][columna].estaIntacta() &&
                this.mapa[fila][columna].esCombustible()) {

            this.mapa[fila][columna].setTipo('~');
            this.mapa[fila][columna].setCombustible(0);
            creado = true;
        }

        return creado;
    }
    public void mostrarMapa() {
        System.out.printf("     ");
        for (int c = 0; c < this.mapa[0].length; c++) {
            System.out.printf("%2d ", c);
        }
        System.out.printf("%n");

        System.out.printf("   +-");
        for (int c = 0; c < this.mapa[0].length; c++) {
            System.out.printf("---");
        }
        System.out.printf("%n");

        for (int f = 0; f < this.mapa.length; f++) {
            System.out.printf("%2d | ", f);
            for (int c = 0; c < this.mapa[f].length; c++) {
                System.out.printf("%2s ", this.mapa[f][c]);
            }
            System.out.printf("%n");
        }
    }


}
