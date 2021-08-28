package testeSemaforo;
import java.util.concurrent.Semaphore;

public class SemaforoMain {

	public static void main(String[] args) throws InterruptedException {
		// 1 permisão
        Semaphore semaphore = new Semaphore(1);
          
        SemaforoThread st1 = new SemaforoThread(semaphore, "Thread1");
        SemaforoThread st2 = new SemaforoThread(semaphore, "Thread2");
          
        st1.start();
        st2.start();
          
        st1.join();
        st2.join();
          
        System.out.println("count: " + Recurso.count);	
	}

}
