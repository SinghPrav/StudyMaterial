package OldMaterial.ExecuterService;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomeServiceExecutor {

    public static void main(String[] args) {
        CustomExecutorService customExecutorService = CustomExecutorThreadPool.createNewFixedThreadPool(2);
        for (int i=0; i<10; i++){
            customExecutorService.execute(new CustomTask());
        }
    }

    interface CustomExecutorService{
        void execute(Runnable e);
    }

   static class CustomExecutorThreadPool {
        static CustomExecutorService createNewFixedThreadPool(int capacity){
            return new CustomThreadPool(capacity);
        }
    }

    static class CustomThreadPool implements CustomExecutorService{
        static int cap;
        static int currentSize;
        static LinkedBlockingQueue<Runnable> linkedBlockingQueue;
        CustomThreadCreation customThreadExecution;
       public CustomThreadPool(int capacity) {
            cap = capacity;
            currentSize = 0;
            linkedBlockingQueue = new LinkedBlockingQueue<>();
            customThreadExecution = new CustomThreadCreation();
        }

        @Override
        public void execute(Runnable e) {
            linkedBlockingQueue.add(e);
            customThreadExecution.executeThreadMethod();
        }
    }

    static class CustomThreadCreation implements Runnable{

        public void executeThreadMethod(){
            if(CustomThreadPool.currentSize < CustomThreadPool.cap){
                CustomThreadPool.currentSize++;
                Thread t = new Thread(new CustomThreadCreation());
                t.start();
            }
        }

        @Override
        public void run() {
            boolean isRun = true;
            while(isRun){
                if(CustomThreadPool.linkedBlockingQueue.size() !=0 ){
                    CustomThreadPool.linkedBlockingQueue.poll().run();
                }else {
                    isRun = false;
                    Thread.yield();
                }
            }
        }
    }

   static class CustomTask implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("*** Thread***"+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
