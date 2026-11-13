package Clases;

public class Personaje {
    private String nombre;
    private int energia;
    private int energiaMaxima;
    private String resultadoDado;

    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energiaMaxima = energia;
        this.energia = energia;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getEnergiaMaxima() {
        return this.energiaMaxima;
    }
    public int getEnergia() {
        return this.energia;
    }
    public int tirarDado(){
        String ResultadoDado;
        int dado;

        dado = (int) (Math.random() * 6) + 1;

        switch (dado){
            case 1:
                ResultadoDado = "\u2680";
                break;
            case 2:
                ResultadoDado = "\u2681";
                break;
            case 3:
                ResultadoDado = "\u2682";
                break;
            case 4:
                ResultadoDado = "\u2683";
                break;
            case 5:
                ResultadoDado = "\u2684";
                break;
            case 6:
                ResultadoDado = "\u2685";
                break;
        }
        System.out.printf("%s",resultadoDado);

        return dado;
    }

    public boolean recibirDano(int cantidad){
        boolean energia = true;

        this.energia -= cantidad;

        energia = estaVivo();

        return energia;
    }

    public boolean estaVivo(){
        boolean estado = true;
        if(this.energia <= 0){
            estado = false;
        }
        return estado;
    }

    protected void recuperarEnergia(int cantidad){
        if(cantidad >= 0){
            this.energia += cantidad;
            if(this.energia > this.energiaMaxima){
                this.energia = this.energiaMaxima;
            }
        }
    }

    public int atacar(){
        int dano;

        dano = 2 * tirarDado();

        return dano;
    }


}