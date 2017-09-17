package fr.parisnanterre.miage.poa.td1.shapes;

public class Cuboid extends Shape3D {
    public double height;
    public double width;
    public double length;

    public Cuboid(Point3D refPoint, double height, double width, double length) {
        super(refPoint);
        this.height = height;
        this.width = width;
        this.length = length;
    }


    @Override
    protected double volume() {
        return this.height*this.width*this.length;
    }

    @Override
    public double surface() {
        return 2*(this.length*this.width+this.length*this.height+this.height*this.width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
