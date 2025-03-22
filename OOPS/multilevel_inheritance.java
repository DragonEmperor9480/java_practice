public class multilevel_inheritance {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.printstrp();
        obj.printstr();
        obj.printstrd();
    }
    
}

class parent
{
    void printstrp()
    {
        System.out.println("Parent Class!");
    }
}

class child extends parent
{
    void printstr()
    {
        System.out.println("Child Class!");
    }
}

class dog extends child{
    void printstrd()
    {
        System.out.println("Dog Class!");
    }
}