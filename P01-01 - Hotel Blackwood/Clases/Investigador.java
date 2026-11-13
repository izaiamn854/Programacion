package Clases;

public class Investigador extends Personaje{
    private int cargas;
    private int botiquines;
    private int puntuacion;
    private int cantidadFantasmasCapturados;
    private static final int ENERGIA = 100;

    Investigador(String nombre){
        super(nombre,ENERGIA);
        this.cantidadFantasmasCapturados = 0;
        this.puntuacion = 0;
        this.cargas = 8;
        this.botiquines = 2;
    }

    public int getCargas() {
        return cargas;
    }

    public int getBotiquines() {
        return botiquines;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public int getCantidadFantasmasCapturados() {
        return cantidadFantasmasCapturados;
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
        String MARCO_ARRIBA= "╔══════════════════════"
        return super.toString();
    }
}