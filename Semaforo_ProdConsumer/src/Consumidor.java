
public class Consumidor implements Runnable{

	Buffer buffer;
	
	public Consumidor(Buffer buffer) {
		super();
		this.buffer = buffer;
		new Thread(this, "Consumidor").start();
	}


	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
		//consumindo um produto
			buffer.get();
		}
		
	}

}
