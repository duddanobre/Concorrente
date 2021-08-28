package questao02;

public class Q2P extends Thread{

	int n = 0;
	
	public Q2P(int n) {
		super();
		this.n = n;
	}

	public void processo() {
		while(n<=2) {
			System.out.println("p - n:" + n);
			n++;
			
		}
		
	}
}
