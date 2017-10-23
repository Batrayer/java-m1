package fr.parisnanterre.miage.poa.td1.shapes;

public class Rectangle extends Shape2D {
    private double length;
    private double width;

    Rectangle(Point2D refpoint2, double length, double width) {
        super(refpoint2);
        this.length = length;
        this.width = width;
    }

    @Override
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
