public class Main {
    public static final int FILA = 12;
    public static final int COLUMNA = 28;
    public static final String MES[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"} ;
    public static void main(String[] args) {
        float[][] temperaturaAnual= new float[FILA][COLUMNA];
        float[] temperaturaMediaMensual= new float[FILA];
        float[] temperaturaMaximaMensual= new float[FILA];
        float[] temperaturaMinimaMensual= new float[FILA];

        
        iniciarVector(temperaturaAnual);
        mostrarVector(temperaturaAnual);

        temperaturaMediaMensual = mediaVectorFila(temperaturaAnual);
        temperaturaMaximaMensual = maximaVectorFila(temperaturaAnual);
        temperaturaMinimaMensual = minimaVectorFila(temperaturaAnual);

        mostrarPorMes(temperaturaMediaMensual);
        mostrarPorMes(temperaturaMaximaMensual);
        mostrarPorMes(temperaturaMinimaMensual);


        System.out.printf("%.2f\n",mediaVector(temperaturaMediaMensual));
        System.out.printf("%.2f\n",maximaVector(temperaturaMaximaMensual));
        System.out.printf("%.2f\n",minimaVector(temperaturaMinimaMensual));




    }
    public static void iniciarVector(float vector[][]){
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector[i].length;j++){
                vector[i][j] = (float)Math.random()*30;
            }
        }

    }
    public static void mostrarVector(float vector[][]){
        for(int i=0;i<vector.length;i++){
            System.out.printf("%-10s",MES[i]);
            for(int j=0;j<vector[i].length;j++){
                System.out.printf("%6.2f ",vector[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static float[] mediaVectorFila(float vector[][]){
        float[] mediaVectorFila = new float[FILA];
            for(int i=0;i<vector.length;i++){
                mediaVectorFila[i] += 0f;

                for(int j=0;j<vector[i].length;j++){
                    mediaVectorFila[i]+=vector[i][j];
                }
                mediaVectorFila[i]= mediaVectorFila[i]/COLUMNA;
            }

        return mediaVectorFila;
    }
    public static float[] maximaVectorFila(float vector[][]){
        float[] maximaVectorFila = new float[FILA];
        for(int i=0;i<vector.length;i++){
            maximaVectorFila[i] = vector[i][0];

            for(int j=1;j<vector[i].length;j++){
                if(vector[i][j]>maximaVectorFila[i]){
                    maximaVectorFila[i]=vector[i][j];
                }
            }
        }

        return maximaVectorFila;
    }
    public static float[] minimaVectorFila(float vector[][]){
        float[] minimaVectorFila = new float[FILA];
        for(int i=0;i<vector.length;i++){
            minimaVectorFila[i] = vector[i][0];

            for(int j=1;j<vector[i].length;j++){
                if(vector[i][j]<minimaVectorFila[i]){
                    minimaVectorFila[i]=vector[i][j];
                }
            }
        }

        return minimaVectorFila;
    }

    public static void mostrarPorMes(float vector[]){
        for(int i=0;i<vector.length;i++){
            System.out.printf("%-10s",MES[i]);
            System.out.printf("%6.2f\n",vector[i]);
        }
        System.out.println();
    }

    public static float mediaVector(float vector[]){
        float media = 0;

        for(int i=0;i<vector.length;i++){
            media +=vector[i];
        }
        media = media/vector.length;

        return media;
    }
    public static float maximaVector(float vector[]){
        float maxima = vector[0];

        for(int i=1;i<vector.length;i++){
            if(vector[i]>maxima){
                maxima =vector[i];
            }
        }

        return maxima;
    }
    public static float minimaVector(float vector[]){
        float minima = vector[0];

        for(int i=1;i<vector.length;i++){
            if(vector[i]<minima){
                minima =vector[i];
            }
        }

        return minima;
    }
}