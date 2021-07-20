//Questão 01
public class Processo extends Thread {

	 int[] C = {9,8,7,6,5,4,3,2,10};
	 int[] D = new int[10];
	 int[] resultado;

	public Processo(int C[], int D[]) {
		this.C = C;
		this.D = D;
	}
		
public int[] processar() {
		int myNumber = 0; int count = 0; int aux =0;
	for(int i = 0;i<C.length; i++){
			myNumber = C[i];
			aux = 0;
		for(int j = 0; j<C.length; j++){
			if(myNumber > C[j]) {
				aux++;
				count = aux;
			}	
		}
		
		System.out.print("\n mynumber: "+myNumber);	
		System.out.print("\n count:" + count);
		for(int x = 0; x<D.length; x++){	
			//x = count+1;
			//System.out.print("\n x:" + x);
			D[count+1] = myNumber;
			System.out.println("\n D:" + D[x]);
		}
		
	}	
	
	
	for(int a = 0; a<D.length; a++){
		System.out.print("[" + D[a] + "]");
	}
		
return D;	
	}

	@Override
	public void run() {
		this.resultado = this.processar();	
	}

	public int[] getResultado() {
		// TODO Auto-generated method stub
		return resultado;
	}
	
	
	  
}
	
