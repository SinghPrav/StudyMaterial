package OldData.OldMaterial.designpatterns.creational.singleton;

public class Singleton {
    private static volatile Singleton instance ;

    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        this.value = value;
    }
    public static Singleton getInstance(String value) {
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}
