package OldData.OldMaterial.designpatterns.creational.prototyppattern;


import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;

    public Shape() {
    }

    public Shape(Shape target) {
        if(target != null){
            this.x = target.x;
            this.y = target.y;
        }
    }

    public abstract Shape clone();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

