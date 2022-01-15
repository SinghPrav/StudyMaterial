package ExecuterService;

import java.util.concurrent.Executors;

public class PauseTest {
    public static void main(String[] args) {
       PausableExecutor pausableExecutor = new PausableExecutor();
       pausableExecutor.beforeExecute(new Task1(), new Task2());
       pausableExecutor.execute(new Task2());
       pausableExecutor.pause();
       pausableExecutor.shutdown();
    }
}
