package OldMaterial.annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        MobileBrand mobileBrand = new MobileBrand("Samsung", 5);
        Class<? extends MobileBrand> c = mobileBrand.getClass();
        SmartPhone smartPhone = c.getAnnotation(SmartPhone.class);
        System.out.println("Smart phone OS : "+smartPhone.osName());
        System.out.println("Smart phone version: "+smartPhone.versionNum());

    }
}
