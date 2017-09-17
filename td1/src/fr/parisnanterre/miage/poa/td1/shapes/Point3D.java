package fr.parisnanterre.miage.poa.td1.shapes;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Point3D extends Point2D {
    protected double z;

    public Point3D(double x, double y,double z)
    {
        super(x,y);
        this.z = z;
    }

    public void translate(double x, double y, double z)
    {
        super.translate(x,y);
        this.z = this.z+z;
    }
    public boolean isOrigin()
    {
        if (super.isOrigin() == true)
        {
            if(this.z == 0.0)
            {
                return true;
            }
        }
        return false;
    }
    public double distance(Point3D p3d)
    {
        double dist;
        dist = sqrt(pow(this.x + p3d.x,2) + pow(this.y + p3d.y,2) + pow(this.z+p3d.z,2));
        return dist;
    }
}
