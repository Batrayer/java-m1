package fr.parisnanterre.miage.poa.td1.shapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Cone extends Shape3D {
    private double height;
    private double radius;
    private Point3D z;

    public Cone(Point3D refPoint, double height, double radius) {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (PI*pow(this.radius,2)*this.height)/3;
    }

    @Override
    public double surface(){
        return (PI*this.radius*sqrt(pow(this.radius,2)+pow(this.height,2)));
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public Point3D getZ() {
        return z;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setZ(Point3D z) {
        this.z = z;
    }
}