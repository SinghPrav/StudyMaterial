package multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDown implements  Runnable{
    CountDownLatch countDownLatch;

    public MyCountDown(CountDownLatch countDownLatch) {
        super();
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("--"+ Thread.currentThread().getName()+"---Ready --"+ countDownLatch.getCount());
        System.out.println("--"+ Thread.currentThread().getName()+"---steady --"+ countDownLatch.getCount());
        System.out.println("--"+ Thread.currentThread().getName()+"---Go --"+ countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("-----Count down --"+ countDownLatch.getCount());
        try {
            Thread.sleep(1000);
            System.out.println("--"+ Thread.currentThread().getName()+"---Reached to destination --"+countDownLatch.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
