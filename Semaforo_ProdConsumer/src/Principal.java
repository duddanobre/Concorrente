
public class Principal {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		new Consumidor(buffer);
		new Produtor(buffer);

	}

}
