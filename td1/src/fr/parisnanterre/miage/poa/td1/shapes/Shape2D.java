package fr.parisnanterre.miage.poa.td1.shapes;

public abstract class Shape2D extends shape implements Translatable2D{
    public Point2D refpoint;

    public Shape2D(Point2D refpoint2) {
        super();
        this.refpoint = refpoint2;
    }

    protected abstract double perimeter();

    public Point2D getRefPoint(){
        return this.refpoint;
    }

    public void setRefpoint(Point2D refpoint2){
        this.refpoint = refpoint2;
    }
}