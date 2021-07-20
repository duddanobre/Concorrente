package sample;

public class MatrizConcorrente {

    public static void main(String[] args) {

        int[][] mat1 = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
        };

        int[][] mat2 = {
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        };

        ProdutoEscalarMatriz p1 = new ProdutoEscalarMatriz(mat1, mat2);
        ProdutoEscalarMatriz ps = new ProdutoEscalarMatriz(mat1, mat2);
        ProdutoEscalarMatriz produtos[] = new ProdutoEscalarMatriz[1000];

        for (int i = 0; i < 20; i++) {
            produtos[i] = new ProdutoEscalarMatriz(mat1, mat2);
        }

        long inicio, fim;
        inicio = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            produtos[i].start();
        }
        for (int i = 0; i < 20; i++) {
            try {
                produtos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        fim = System.currentTimeMillis();
        System.err.println(ps.getResultado());
        System.err.println(p1.getResultado());
        System.out.println("Total: " + (fim - inicio));


    }

}
