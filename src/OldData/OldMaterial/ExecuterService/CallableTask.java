package OldData.OldMaterial.ExecuterService;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private final String taskName;

    public CallableTask(String taskName){
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Task->"+taskName;
    }
}
