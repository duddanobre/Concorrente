import java.util.concurrent.Semaphore;

public class Buffer {
	// item que ser� produzido e consumido
	static int produto;
	
	//semaforo do Produtor
	static Semaphore sProducer = new Semaphore(1);
	//semaforo do Consumidor
	static Semaphore sConsumer = new Semaphore(0);
	
	public void get(){
        try {
        //adquire  uma permiss�o
            sConsumer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("erro" + e);
        }
  
        System.out.println("Consumidor consumiu o produto " + produto);
        //libera a permiss�o recebida
        sProducer.release();
    }
	
	public void put(int produto){
        try {
        //adquire  uma permiss�o	
            sProducer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("erro" + e);
        }
  
      //fase de produ��o
        this.produto = produto;
  
        System.out.println("Produto gerado : " + produto);
        
        //libera a permiss�o recebida
        sConsumer.release();
    }
  
}
