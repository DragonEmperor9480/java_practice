public class SuperMethod {
    public static void main(String[] args) {
        child x = new child();
        
    }
    
}
class parent
{
    int x = 10;
    int y = 20;
    parent()
    {
        System.out.println("Parent Class!");
    }
    void show(){
        System.out.println("Hello");
    }
}

class child extends parent
{
    child()
    {
        super.show();
        System.out.println("Child Class!");
        System.out.println(super.x + super.y);
    }
}
