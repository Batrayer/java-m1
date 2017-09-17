package fr.parisnanterre.miage.poa.td1.shapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Shape3D{
    public double radius;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4/3*PI*pow(this.radius,3);
    }

    @Override
    public double surface() {
        return 4*PI*pow(this.radius,2);
    }
}
