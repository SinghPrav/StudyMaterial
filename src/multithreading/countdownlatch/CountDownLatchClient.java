package multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchClient {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Primary Thread");
        CountDownLatch countDownLatch = new CountDownLatch(3);
        System.out.println("----"+Thread.currentThread().getName()+"---Started work--");
        Thread t1 = new Thread(new MyCountDown(countDownLatch), "First");
        Thread t2 = new Thread(new MyCountDown(countDownLatch), "Second");
        Thread t3 = new Thread(new MyCountDown(countDownLatch), "Third");
        t1.start();
        t2.start();
        t3.start();
        countDownLatch.await();

        System.out.println("----"+Thread.currentThread().getName()+"---Completed work--"+ countDownLatch.getCount());
    }
}
