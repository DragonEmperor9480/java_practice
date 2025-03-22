public class single_inheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.printstrp();
        int z = obj.add(10, 10);
        int x = obj.sub(10, 10);
        int c = obj.mul(10, 10);
        int v = obj.div(10, 10);
        obj.printstr();
        System.out.println(z+x+c+v);
    }

    
}

class parent
{
    void printstrp()
    {
        System.out.println("Parent Class!");
    }
    int add(int a,int b)
    {
        return a+b;
    }

    int sub(int a, int b)
    {
        return a-b;
    }

    int mul(int a, int b)
    {
        return a*b;
    }

    int div(int a, int b)
    {
        return a/b;
    }
}

class child extends parent
{
    void printstr()
    {
        System.out.println("Child Class!");
    }
}