class Shape{
    double calculateArea(double x, double y)
    {
        return (x*y);
    }
}

class Circle extends  Shape{
    void CircleArea(double x)
    {
        System.out.println("Area of Circle is:"+(22/7)*x*x);
    }
}
class Rectangle extends Shape{
    void RectangleArea(double x, double y)
    {
        System.out.println("Area of Rectangle is:"+ x*y);
    }
}

public class Abstract_class_Interface {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        obj1.CircleArea(10);
        obj2.RectangleArea(10, 20);
    }
}
