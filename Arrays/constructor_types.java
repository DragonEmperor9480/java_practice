public class constructor_types {
    public static void main(String[] args) {
        default_constructor obj = new default_constructor();
        parameterized_constructor obj2 = new parameterized_constructor(5,5);
        Copy_constructor obj3 = new Copy_constructor(30,30);
        Copy_constructor obj4 = new Copy_constructor(obj3);
    }
    
}

//Default Constructor
class default_constructor{
    int a;
    default_constructor()
    {
        a=10;
        System.out.println(a);
    }

}

//Parameterized Constructor
class parameterized_constructor{
    parameterized_constructor(int a, int b)
    {
        System.out.println(a+b);
    }
}

//Copy Constructor
class Copy_constructor{
    int x,y,a,b;
    Copy_constructor(int a, int b)
    {
        this.a=10;
        this.b=20;
    }
    Copy_constructor(Copy_constructor s)
    {
        x=s.a;
        y=s.b;
        System.out.println("x:"+x+" y:"+y);
    }
}