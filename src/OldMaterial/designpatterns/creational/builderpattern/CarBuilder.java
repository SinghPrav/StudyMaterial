package OldMaterial.designpatterns.creational.builderpattern;

public class CarBuilder implements Builder{
   private int seats;
   private Engine engine;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
       return new Car(seats, engine);
    }
}
