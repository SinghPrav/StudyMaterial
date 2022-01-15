package designpatterns.creational.singleton;

public class SingletonWithoutLock {
    private static SingletonWithoutLock singletonWithoutLock;
    public String value;
    private SingletonWithoutLock(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonWithoutLock getSingletonWithoutLock(String value){
        if(singletonWithoutLock == null){
            singletonWithoutLock = new SingletonWithoutLock(value);
        }
        return singletonWithoutLock;
    }
}
