package designpatterns.creational.singleton;

public class SingletonDesignClient {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SingletonWithoutLock singleton = SingletonWithoutLock.getSingletonWithoutLock("Primary");
        SingletonWithoutLock second = SingletonWithoutLock.getSingletonWithoutLock("Secondary");
        System.out.println(singleton.value);
        System.out.println(second.value);

        Thread t1 = new Thread(new ThreadFirst());
        t1.start();

        Thread t2 = new Thread(new ThreadSecond());
        t2.start();

    }

    static class  ThreadFirst implements Runnable{

        @Override
        public void run() {
            Singleton singleton= Singleton.getInstance("In Thread First");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSecond implements Runnable{

        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("In Thread Second");
            System.out.println(singleton.value);
        }
    }

}
