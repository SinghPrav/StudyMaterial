package OldMaterial.ExecuterService;

public class Task2  implements Runnable{
    @Override
    public void run() {
        System.out.println("---Task2 started---");
        for(int i= 1;i< 10; i++){
            System.out.println(i+" ");
        }
        System.out.println("---Task2 Done---");
    }
}
