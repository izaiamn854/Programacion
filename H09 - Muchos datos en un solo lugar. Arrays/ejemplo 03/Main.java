public class Main {
    public static final int FILA = 28;
    public static final int COLUMNA = 12;
    public static void main(String[] args) {
        float[][] temperaturaAnual= new float[FILA][COLUMNA];
        iniciarVector(temperaturaAnual);
        mostrarVector(temperaturaAnual);

    }
    public static void iniciarVector(float[][] vector){
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector[i].length;j++){
                vector[j][i] = (float)Math.random(*30);
            }
        }

    }
    public static void mostrarVector(int[][] vector){
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector[i].length;j++){
                System.out.printf("%5.2f ",vector[i][j]);
            }
            System.out.println();
        }
    }
}