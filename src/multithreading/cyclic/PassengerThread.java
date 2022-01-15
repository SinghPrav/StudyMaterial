package multithreading.cyclic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassengerThread extends Thread{
    private int duration;
    private CyclicBarrier cyclicBarrier;


    public PassengerThread(int duration, CyclicBarrier cyclicBarrier, String pName) {
        super(pName);
        this.duration = duration;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);
            System.out.println(Thread.currentThread().getName() + " is arrived.");

            int await = cyclicBarrier.await();
            if(await == 0) {
                System.out.println("Four passengers have arrived so cab is going to start..");
            }
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
