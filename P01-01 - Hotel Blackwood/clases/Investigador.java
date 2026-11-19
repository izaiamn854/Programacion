package clases;

import java.text.Format;

public class Investigador extends Personaje{
    private int cargas;
    private int botiquines;
    private int puntuacion;
    private int cantidadFantasmasCapturados;
    private static final int ENERGIA = 100;

    public Investigador(String nombre){
        super(nombre,ENERGIA);
        this.cantidadFantasmasCapturados = 0;
        this.puntuacion = 0;
        this.cargas = 8;
        this.botiquines = 2;
    }

    public int getCargas() {
        return this.cargas;
    }

    public int getBotiquines() {
        return this.botiquines;
    }
    public int getPuntuacion() {
        return this.puntuacion;
    }
    public int getCantidadFantasmasCapturados() {
        return this.cantidadFantasmasCapturados;
    }
    public void recargar(int cantidad){
        if(cantidad >= 0){
            this.cargas += cantidad;

        }
    }
    public boolean usarBotiquin(){
        boolean usar = false;
        final int ENERGIA = 30;

        if(this.botiquines != 0 && this.getEnergia() != this.getEnergiaMaxima()){
                usar = true;
                recuperarEnergia(ENERGIA);
                this.botiquines--;
        }

        return usar;
    }

    public void agregarBotiquin(int cantidad){
        if(cantidad >= 0){
            this.botiquines += cantidad;
        }
    }

    public void sumarPuntos(int puntuacion){
        if(puntuacion > 0){
            this.puntuacion += puntuacion;
        }
    }

    public void gastarPuntos(int puntuacion){
        if(puntuacion > 0){
            this.puntuacion -= puntuacion;
        }
    }

    public void registrarCaptura(){
        this.cantidadFantasmasCapturados++;
    }

    @Override
    public int atacar(){
        int dano;

        dano = tirarDado() * 5;

        return dano;
    }

    @Override
    public String toString() {
        String totalCorazones = "";
        String CORAZON = "\033[31m♥\033[0m";
        char COCRAZON_VACIO = '·';

        for (int i =1 ; i < 11; i++){
            if(i  <= super.getEnergia() * 100 / super.getEnergiaMaxima()){
                totalCorazones += CORAZON;
            } else {
                totalCorazones += COCRAZON_VACIO;
            }

        }

        String MARCO_ARRIBA = "╔═════════════════════════════════╗\n";
        String energia = String.format("║ Energía:             %s ║\n", totalCorazones);
        String cargas = String.format("║ Cargas disponibles:      %06d ║\n",this.getCargas());
        String botiquines = String.format("║ Botiquines:              %06d ║\n",this.getBotiquines());
        String puntuacion = String.format("║ Puntuacion:              %06d ║\n",this.getPuntuacion());
        String capturado = String.format("║ Fantasmas capturados:    %06d ║\n",this.getCantidadFantasmasCapturados());
        String MARCO_ABAJO = "╚═════════════════════════════════╝\n";

        return MARCO_ARRIBA + energia + cargas + botiquines + puntuacion + capturado + MARCO_ABAJO;
    }
}