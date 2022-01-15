package ExecuterService;

import java.util.concurrent.LinkedBlockingQueue;

public class MyExecutorServiceCustom {

    public static void main(String[] args) {
       System.out.println(Runtime.getRuntime().availableProcessors());
        MyExecutorService service = CustomExecutor.newFixedThreadPool(3);
        for (int i = 0; i < 7; i++) {
            service.execute(new MyTask());
        }
    }

    interface MyExecutorService {
        void execute(Runnable r);
    }

    static class CustomExecutor {
        static MyExecutorService newFixedThreadPool(int capacity){
            return  new MyThreadPool(capacity);
        }
    }


    static class MyThreadPool implements MyExecutorService{
        static int capacity;
        static int currentCapacity;
        static LinkedBlockingQueue<Runnable> linkedBlockingQueue;
        private final ThreadPoolExecution e;

        public MyThreadPool(int cap) {
            capacity = cap;
            currentCapacity = 0;
            linkedBlockingQueue = new LinkedBlockingQueue<>();
            e = new ThreadPoolExecution();
        }


        @Override
        public void execute(Runnable r) {
            linkedBlockingQueue.add(r);
            e.executeMyMethod();
        }
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Print::-> " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ThreadPoolExecution implements Runnable{

        public void executeMyMethod(){
            if(MyThreadPool.currentCapacity < MyThreadPool.capacity){
                MyThreadPool.currentCapacity++;
                Thread t = new Thread(new ThreadPoolExecution());
                t.start();
            }
        }

        @Override
        public void run() {
                boolean isRun = true;
                while(isRun){
                    if(MyThreadPool.linkedBlockingQueue.size()!= 0) {
                        MyThreadPool.linkedBlockingQueue.poll().run();
                    }else{
                        isRun = false;
                        Thread.yield();
                    }
                }
        }
    }
}