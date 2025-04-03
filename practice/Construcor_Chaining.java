class Grandparent{
    Grandparent()
    {
        System.out.println("Grandparent constructor!");
    }
}

class Parent extends Grandparent{
    Parent(){
        System.out.println("Parent Constructor!");
    }
}
class Child extends Parent{
    Child()
    {
        System.out.println("Child Constructor!");
    }
}
public class Construcor_Chaining {
    public static void main(String[] args) {
        Child obj = new Child();
    }
    
}
