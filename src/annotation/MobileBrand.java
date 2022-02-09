package annotation;

@SmartPhone(versionNum = 11)
public class MobileBrand {
    String model;
    int size;

    public MobileBrand(String model, int size){
        this.model = model;
        this.size = size;
    }
}
