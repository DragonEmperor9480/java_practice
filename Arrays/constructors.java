public class constructors {
    public static void main(String[] args) {
        Cons obj = new Cons();
        System.out.println(obj.Sum());
        
    }
}

class Cons{
    int a,b;
    Cons()
    {
        a = 20;
        b = 40;
    }

    int Sum()
    {
        return a+b;
    }
}
