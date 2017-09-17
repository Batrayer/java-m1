package fr.parisnanterre.miage.poa.td1.shapes;

public abstract class Shape3D extends shape implements Translatable3D{
    private Point3D refPoint;

    Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    public Point3D getRefPoint() {
        return refPoint;
    }

    protected abstract double volume();
}
