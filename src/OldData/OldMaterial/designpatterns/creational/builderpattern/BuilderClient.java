package OldData.OldMaterial.designpatterns.creational.builderpattern;

public class BuilderClient {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructHatchBackCar(carBuilder);
        Car car;
         car = carBuilder.getResult();
        System.out.println(car);
        System.out.println("CC->"+car.getEngine());

        director.constructSedanCar(carBuilder);
         car = carBuilder.getResult();
        System.out.println(car);
        System.out.println("CC->"+car.getEngine());

        director.constructSuvCar(carBuilder);
        car = carBuilder.getResult();
        System.out.println(car);
        System.out.println("CC->"+car.getEngine());
    }
}
