package OldData.OldMaterial.multithreading.cyclic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ClientTest {
    public static void main(String args[]) throws InterruptedException, BrokenBarrierException {

        System.out.println(Thread.currentThread().getName() + " has started");

        CyclicBarrier barrier = new CyclicBarrier(4);

        PassengerThread p1 = new PassengerThread(1000, barrier, "First");
        PassengerThread p2 = new PassengerThread(2000, barrier, "Second");
        PassengerThread p3 = new PassengerThread(3000, barrier, "Third");
        PassengerThread p4 = new PassengerThread(4000, barrier, "Fourth");

        PassengerThread p5 = new PassengerThread(1000, barrier, "Fifth");
        PassengerThread p6 = new PassengerThread(2000, barrier, "Six");
        PassengerThread p7 = new PassengerThread(3000, barrier, "Seven");
        PassengerThread p8 = new PassengerThread(4000, barrier, "Eight");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p5.start();
        p6.start();
        p7.start();
        p8.start();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
