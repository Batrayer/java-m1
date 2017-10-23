package fr.parisnanterre.miage.poa.td1.shapes;

public abstract class Shape3D extends Shape implements Translatable3D{
    public Point3D refPoint;

    Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    public Point3D getRefPoint() {
        return refPoint;
    }

    protected abstract double volume();

    public void setRefPoint(Point3D refPoint) {
        this.refPoint = refPoint;
    }
}
