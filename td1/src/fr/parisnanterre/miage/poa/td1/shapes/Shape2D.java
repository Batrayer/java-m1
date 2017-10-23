package fr.parisnanterre.miage.poa.td1.shapes;

public abstract class Shape2D extends Shape implements Translatable2D{
    private Point2D refpoint;

    Shape2D(Point2D refpoint2) {
        super();
        this.refpoint = refpoint2;
    }


    public abstract double perimeter();

    public Point2D getRefPoint(){
        return this.refpoint;
    }

    public void setRefpoint(Point2D refpoint2){
        this.refpoint = refpoint2;
    }


}