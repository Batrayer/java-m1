package fr.parisnanterre.miage.poa.td1.shapes;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point2D {
    protected double x;
    protected double y;

    protected Point2D(double x, double y) {
        this.y = y;
        this.x = x;
    }

    protected void translate(double a, double b){
        this.x = this.x+a;
        this.y = this.y+b;
        return;
    }

    public boolean isOrigin() {
        if (this.x == 0.0 && this.y == 0.0)
            return true;
        return false;
    }


    public double distance(Point2D p){
        return sqrt( pow((this.x - p.x),2) + pow((this.y - p.y),2));
    }
}
