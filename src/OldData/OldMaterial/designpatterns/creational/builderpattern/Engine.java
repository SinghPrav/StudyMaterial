package OldData.OldMaterial.designpatterns.creational.builderpattern;

public class Engine {
    private int volume;
    private double mileage;

    public Engine(int volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", mileage=" + mileage +
                '}';
    }
}
