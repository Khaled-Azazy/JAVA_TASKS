abstract class Shape{
    abstract public double getArea();
    public static void sumArea(Shape s1, Shape s2, Shape s3){
        double res = s1.getArea() + s2.getArea() + s3.getArea();
        System.out.println( "the sum of all areas are: " + res);
    }
}



class Circle extends Shape{
    private double radius;

    public Circle(double r){
        radius = r;
    }


    public double getArea(){
        return radius*radius*3.14;
    }
}


class Rectangular extends Shape{
    
    private double width;
    private double height;

    public Rectangular(double w, double h){
        width = w;
        height = h;
    }

    public double getArea(){
        return width * height;
    }
}


class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(double h, double b){
        height = h;
        base = b;
    }

    public double getArea(){
        return 0.5*height*base;
    }
}



class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 3);
        Circle c = new Circle(3);
        Rectangular r = new Rectangular(2, 2);

        Shape.sumArea(t, c, r);


    }

}