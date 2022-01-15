package multithreading;

public class PrintOddEven {
    boolean odd = false;
    int count = 1;
    int MAX = 20;

    public static void main(String[] args) throws Exception {
        PrintOddEven printOddEven = new PrintOddEven();
        printOddEven.odd = true;
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("*********Print1 **********");
                printOddEven.printEven();
            }
        });

        Thread thread2 = new Thread(printOddEven::printOdd);
        System.out.println("*********woo **********");
        thread1.start();
        thread2.start();
        System.out.println("*********Brofre join 1**********");
        thread1.join();
        System.out.println("*********After join 1**********");
        thread2.join();
        System.out.println("*********After join 2**********");
    }

    public void printOdd() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("----Checking Odd loop");
                while (!odd) {
                    try {
                        System.out.println("----Odd waiting---" + count);
                        wait();
                        System.out.println("-----Notified odd---" + count);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("-----Odd thread----" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("----Checking Even loop---");
                while (odd) {
                    try {
                        System.out.println("------Even waiting-----");
                        wait();
                        System.out.println("------Notified even---");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   }
                    System.out.println("------Even thread ---" + count);
                    count++;
                    odd = true;
                    notify();

            }
        }
    }
}

