package testeSemaforo;
import java.util.concurrent.Semaphore;

class Recurso {
	static int count = 0;
}
//implementando semaforo simples, estudos
public class SemaforoThread extends Thread {

	Semaphore semaforo;
	String thread;
	public SemaforoThread(Semaphore semaforo, String thread) {
		super(thread);
		this.semaforo = semaforo;
		this.thread = thread;
	}
	
	@Override
	public void run() {
		if(this.getName().equals("Thread1")) {
			System.out.println("Iniciando... " + thread);
			
			try{
                System.out.println(thread + " aguardando permissão...");
              
                semaforo.acquire();
              
                System.out.println(thread + " permitido");
          
                for(int i=0; i < 5; i++)
                {
                    Recurso.count++;
                    System.out.println(thread + ": " + Recurso.count);
          
                    Thread.sleep(10);
                }
            }catch (InterruptedException exc) {
                    System.out.println(exc);
                }
          
                System.out.println(thread + " liberado");
                semaforo.release();
        }else {
        	// inicia outra thread - thread 2
        	System.out.println("carregando... " + thread);
            try 
            {
            	System.out.println(thread + " aguardando permissão...");
              
                semaforo.acquire();
              
                System.out.println(thread + " permitido");
          
                for(int i=0; i < 5; i++)
                {
                    Recurso.count--;
                    System.out.println(thread + ": " + Recurso.count);
          
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                    System.out.println(exc);
                }
              
                System.out.println(thread + " liberando...");
                semaforo.release();
        }
	}
}