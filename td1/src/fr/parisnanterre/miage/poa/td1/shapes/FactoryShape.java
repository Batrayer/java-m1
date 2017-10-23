package fr.parisnanterre.miage.poa.td1.shapes;

public class FactoryShape {
    public FactoryShape() {
    }

    public Shape2D constructSquare(double x, double y, double length) {
        Point2D pd2 = new Point2D(x,y);
        Square spongebob = new Square(pd2, length);
        return spongebob;
    }

    public Shape2D constructRectangle(double x, double y, double height, double width){
        Point2D pd2 = new Point2D(x,y);
        Rectangle rct = new Rectangle(pd2,height,width);
        return rct;
    }

    public Shape3D constructCone(double x, double y, double z, double height, double radius){
       Point3D pd3 = new Point3D(x,y,z);
       Cone co = new Cone(pd3, height, radius);
       return co;
    }

    public Shape3D consctructCuboid(double x, double y, double z, double height, double width, double length){
        Point3D pd3 = new Point3D(x,y,z);
        Cuboid cbd = new Cuboid(pd3, height, width, length);
        return cbd;
    }

    

}