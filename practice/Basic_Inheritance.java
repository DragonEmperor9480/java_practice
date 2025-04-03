class Animal{
    void makeSound()
    {
        System.out.println();
    }
}
class Dog extends Animal{
    void makeSound()
    {
        System.out.println("Bark!");
    }
}

class Cat extends  Animal{
    void makeSound()
    {
        System.out.println("Meow!");
    }
}

public class Basic_Inheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj1.makeSound();
        obj2.makeSound();
    }
    
}
