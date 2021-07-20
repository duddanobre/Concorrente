package sample;

public class ProdutoEscalarMatriz extends Thread {

    int mat1[][];
    int mat2[][];
    int[][] resultado;

    public ProdutoEscalarMatriz(int[][] mat1, int[][] mat2) {
        this.mat1 = mat1;
        this.mat2 = mat2;
    }

    public int[][] calcular() {
        int r = 0;
        int[][] escalar = new int[mat1.length][mat2.length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                for (int x = 0; x < mat1.length; x++) {
                    // r =  mat1[i][j]*mat2[j][i];
                    //System.out.println("r: " + r);
                    escalar[i][j] += mat1[x][i] * mat2[j][x];
                }
                System.out.println("soma: " + escalar[i][j]);
            }

        }
        return escalar;
    }

    @Override
    public void run() {
        this.resultado = this.calcular();
    }

    public int[][] getResultado() {
        /*for (int x=0;x< resultado.length;x++){
            for(int y = 0; y< resultado.length; y++){
                resultado[x][y] += resultado[x][y];
                System.out.println("soma: " + resultado[x][y]);
            }

        }*/

        return resultado;
    }

}