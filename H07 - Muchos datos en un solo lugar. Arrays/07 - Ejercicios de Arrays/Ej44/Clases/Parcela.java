package Clases;

public class Parcela {
    protected static char[] TIPO = {'T', 'm', 'a', '~', '^'};
    private static char[] ESTADO = {' ','*','#'};
    private static int[] COMBUSTIBLE = {3,1,0};

    private char tipo;
    private char estado;
    private int combustible;
    private boolean proximamenteArdiendo;

    public Parcela(){
         int tipoAleatorio;

         tipoAleatorio = (int)(Math.random()*100)+1;

         if (tipoAleatorio <= 55) {
             this.tipo = TIPO[0];
             this.combustible = COMBUSTIBLE[0];
         } else if (tipoAleatorio <= 75) {
             this.tipo = TIPO[1];
             this.combustible = COMBUSTIBLE[1];
         } else if (tipoAleatorio <= 85) {
             this.tipo = TIPO[2];
             this.combustible = COMBUSTIBLE[2];
         } else if (tipoAleatorio <= 95) {
             this.tipo = TIPO[3];
             this.combustible = COMBUSTIBLE[2];
         } else {
             this.tipo = TIPO[4];
             this.combustible = COMBUSTIBLE[2];
         }

         this.estado = ESTADO[0];
         this.proximamenteArdiendo = false;
    }
    public boolean esCombustible(){
        return (this.tipo == TIPO[0] || this.tipo == TIPO[1]) && this.combustible > 0;
    }

    public boolean estaIntacta(){
        return (this.estado == ESTADO[0]);
    }

    public boolean estaArdiendo(){
        return (this.estado == ESTADO[1]);
    }

    public void prender(){
        if (this.estaIntacta() && this.esCombustible()){
            this.estado = ESTADO[1];
        }
    }

    public  void marcarParaArder(){
        this.proximamenteArdiendo = (this.estaIntacta() && this.esCombustible());
    }

    public void aplicarSiguienteEstado(){
        if (this.proximamenteArdiendo){
            this.estado = ESTADO[1];
            this.proximamenteArdiendo = false;
        }
    }

    public void consumirTurno(){
        if (this.estaArdiendo()){
            this.combustible--;
            if (this.combustible == 0){
                this.estado = ESTADO[2];
            }
        }
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public char getEstado() {
        return this.estado;
    }

    @Override
    public String toString() {
        String respuesta = "";
        if (this.estado == ESTADO[0]){
            respuesta+= this.tipo;
        } else {
            respuesta+= this.estado;
        }
        return respuesta;
    }
}