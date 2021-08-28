
public class Principal {

	
	public static void main(String[] args) {
	
		 int[] C = {9,8,7,6,5,4,3,2,10};
		 int[] D = new int[10];
		 
		 Processo p1 = new Processo(C, D);
		 Processo p2 = new Processo(C, D);
		 Processo p3 = new Processo(C, D);
		 Processo processos[] = new Processo[10];
		 
		 for (int i = 0; i < 10; i++) {
	            processos[i] = new Processo(C, D);
	     }
		 
		 	long inicio, fim;
	        inicio = System.currentTimeMillis();

	        for (int i = 0; i<10; i++) {
	                processos[i].start();
	        }
	        for (int i = 0; i < 10; i++) {
	            try {
	                processos[i].join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        fim = System.currentTimeMillis();
	         System.err.println("\n P1: "+p1.getResultado());
	         System.err.println("\n P2: "+p2.getResultado());
	         System.err.println("\n P3: "+p3.getResultado());
	        System.out.println("Total: " + (fim-inicio));

	}

}
