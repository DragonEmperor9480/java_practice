public class hiearchcal_inheritance {
    public static void main(String[] args) {
        child x = new child();
        dog y = new dog();
        x.printstrp();
        y.printstrp();
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

class dog extends parent{
    void printstrd()
    {
        System.out.println("Dog Class!");
    }
}
