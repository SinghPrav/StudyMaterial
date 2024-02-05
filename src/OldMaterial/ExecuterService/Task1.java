package OldMaterial.ExecuterService;

public class Task1 extends Thread{

    public void run(){
        System.out.println("---Task1 started---");
        for(int i= 1;i< 10; i++){
            System.out.println(i+" ");
        }
        System.out.println("---Task1 Done---");
    }
}
