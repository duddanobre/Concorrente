package sample;

public class MatrizSequencial {

    // 62 segundos

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
                {20, 19, 18, 17, 16, 15, 14, 13, 12, 11},
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

        ProdutoEscalarMatriz p0 = new ProdutoEscalarMatriz(mat1, mat2);
        ProdutoEscalarMatriz p1 = new ProdutoEscalarMatriz(mat1, mat2);
        ProdutoEscalarMatriz p2 = new ProdutoEscalarMatriz(mat1, mat2);

        long inicio, fim;

        inicio = System.currentTimeMillis();
        p0.start();
        p1.start();
        p2.start();
        try {
            p0.join();
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        fim = System.currentTimeMillis();
       /* System.err.println("p1 vetor " + p1.getResultado());
        System.err.println("p2 Matriz " + p2.getResultado());
        System.err.println("p0 vetor " + p0.getResultado()); */
        System.out.println("Total de tempo: " + (fim - inicio));
    }
}
