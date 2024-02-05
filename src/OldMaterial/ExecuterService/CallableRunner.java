package OldMaterial.ExecuterService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> futurePrimary = executorService.submit(new CallableTask("FirstTask"));
        System.out.println("--Main thread--Started---");
        String taskName = futurePrimary.get();
        System.out.println("-------1---"+taskName);
        System.out.println("--Main thread---completed--");

        List<CallableTask> callableTasks = List.of(new CallableTask("FirstTask"), new CallableTask("SecondTask")
                , new CallableTask("Third task"), new CallableTask("Fourth task"), new CallableTask("Fifth task"));
        System.out.println("--Main thread--Started---");


        List<Future<String>> futureList = executorService.invokeAll(callableTasks);
        for (Future<String> future: futureList){
            String stringFuture = future.get();
            System.out.println("-------in loop---"+stringFuture);
        }

        String future = executorService.invokeAny(callableTasks);
        System.out.println("-------Invoke Any---"+future);
        System.out.println("--Main thread---completed--");
        executorService.shutdown();
    }
}
