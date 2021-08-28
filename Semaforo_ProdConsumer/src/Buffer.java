import java.util.concurrent.Semaphore;

public class Buffer {
	// item que será produzido e consumido
	static int produto;
	
	//semaforo do Produtor
	static Semaphore sProducer = new Semaphore(1);
	//semaforo do Consumidor
	static Semaphore sConsumer = new Semaphore(0);
	
	public void get(){
        try {
        //adquire  uma permissão
            sConsumer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("erro" + e);
        }
  
        System.out.println("Consumidor consumiu o produto " + produto);
        //libera a permissão recebida
        sProducer.release();
    }
	
	public void put(int produto){
        try {
        //adquire  uma permissão	
            sProducer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("erro" + e);
        }
  
      //fase de produção
        this.produto = produto;
  
        System.out.println("Produto gerado : " + produto);
        
        //libera a permissão recebida
        sConsumer.release();
    }
  
}
