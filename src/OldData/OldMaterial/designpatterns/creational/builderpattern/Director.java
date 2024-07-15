package OldData.OldMaterial.designpatterns.creational.builderpattern;

public class Director {

    public void constructHatchBackCar(Builder builder){
        builder.setEngine(new Engine(800, 20));
        builder.setSeats(5);
    }

    public void constructSedanCar(Builder builder){
        builder.setEngine(new Engine(1200, 18));
        builder.setSeats(5);
    }

    public void constructSuvCar(Builder builder){
        builder.setEngine(new Engine(1400, 12));
        builder.setSeats(5);
    }
}
