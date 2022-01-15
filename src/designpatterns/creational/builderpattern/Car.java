package designpatterns.creational.builderpattern;

public class Car {
    private final int seat;
    private final Engine engine;

    public Car(int seat, Engine engine) {
        this.seat = seat;
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seat=" + seat +
                ", engine=" + engine +
                '}';
    }
}
