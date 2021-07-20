package sample;

public class ProdutoVetorial extends Thread {

    int vetor1[];
    int vetor2[];
    int resultado;

    public ProdutoVetorial(int[] vetor1, int[] vetor2) {
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;
    }

    public int calcular() {
        int soma = 0;
        for (int i = 0; i < vetor1.length; i++) {
            soma += vetor1[i] * vetor2[i];
            // System.out.println("PV: \n" +  soma);
        }
        return soma;
    }

    @Override
    public void run() {
        this.resultado = this.calcular();
    }

    public int getResultado() {
        return resultado;
    }

}