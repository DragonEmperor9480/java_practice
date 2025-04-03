class Vehicles{
    void move()
    {
        System.out.println("Vehicles can move");
    }
}

class Car extends Vehicles{
    void move()
    {
        System.out.println("Cars move on Roads");
    }
}
class Boat extends Vehicles{
    void move()
    {
        System.out.println("Boats move on water");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Boat obj2 = new Boat();
        obj1.move();
        obj2.move();

    }
    
}
