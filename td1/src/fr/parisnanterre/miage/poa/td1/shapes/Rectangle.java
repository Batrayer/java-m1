package fr.parisnanterre.miage.poa.td1.shapes;

public class Rectangle extends Shape2D {
    protected double length;
    protected double width;

    public Rectangle(Point2D refpoint2, double length, double width) {
        super(refpoint2);
        this.length = length;
        this.width = width;
    }

    public double surface()
    {
        return this.length*this.width;
    }

    @Override
    public double perimeter()
    {
        return this.length*2+this.width*2;
    }
}
