package OldData.OldMaterial.designpatterns.strutural.Decorator;

public abstract class ShapeDecorator implements  Shape{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape)
    {
        // This keywordd refers to current object itself
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
