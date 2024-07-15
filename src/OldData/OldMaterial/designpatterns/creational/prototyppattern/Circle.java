package OldData.OldMaterial.designpatterns.creational.prototyppattern;

import java.util.Objects;

public class Circle extends Shape{
    public int rad;

    public Circle() {
    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.rad = target.rad;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return rad == circle.rad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rad);
    }
}
