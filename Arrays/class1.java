public class class1 {

    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.add(10,20);
        obj.sub(20,10);
        obj.mul(30,40);
        obj.div(40,50);

    }
}

class Calc{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void sub(int a, int b)
    {
        System.out.println(-+b);
    }
    void mul(int a, int b)
    {
        System.out.println(a*b);
    }
    void div(int a, int b)
    {
        System.out.println(a/b);
    }
}
