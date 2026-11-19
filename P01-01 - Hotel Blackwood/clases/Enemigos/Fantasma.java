package clases.Enemigos;
import clases.Enemigos.Enemigo;

public class Fantasma extends Enemigo {
    int energia = (int)(Math.random()*15)+16;
    int PUNTOS = 100;
    public Fantasma(String nombre) {
        super(nombre,energia,PUNTOS);
    }
}