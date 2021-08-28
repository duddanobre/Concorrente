
public class Produtor implements Runnable{

	Buffer buffer;
	
	public Produtor(Buffer buffer) {
		super();
		this.buffer = buffer;
		new Thread(this, "Produtor").start();
	}

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
		//fase de produção
			buffer.put(i);
		}
		
	}

}
