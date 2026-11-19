package clases.Enemigos;
import clases.Personaje;

public class Enemigo  extends Personaje {
    int puntos;

    protected Enemigo(String nombre, int resistencia, int puntos) {
        super(nombre,resistencia);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        String totalCorazones = "";
        char CORAZON = '\u2593';
        char COCRAZON_VACIO = '\u2591';

        for (int i =1 ; i < 11; i++){
            if(i  <= super.getEnergia() * 100 / super.getEnergiaMaxima()){
                totalCorazones += CORAZON;
            } else {
                totalCorazones += COCRAZON_VACIO;
            }

        }

        String datos = String.format("%s | %s | %06%$\n",super.getNombre(), totalCorazones, this.puntos);

        return datos;
    }
}