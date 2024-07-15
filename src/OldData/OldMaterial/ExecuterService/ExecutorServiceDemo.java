package OldData.OldMaterial.ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.println("----All tasks done---  ");
        executorService.shutdown();

        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        executorService1.execute(new Task1());
        executorService1.execute(new Thread(new Task2()));
        executorService1.shutdown();
    }
}
