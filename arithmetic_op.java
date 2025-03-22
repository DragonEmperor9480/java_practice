public class arithmetic_op {
    public static void main(String[] args) {
        add(5,5);
        sub(5,5);
        mul(5,5);
        div(5,5);
        mod(5,5);

        
    }

    static void add(int a, int b)
    {
        System.out.println("Addition:"+ (a+b));
    }

    static void sub(int a,int b)
    {
        System.out.println("Subtraction:"+(a-b));
    }

    static void mul(int a, int b)
    {
        System.out.println(("Multiplication:"+(a*b)));
    }
    static void div(int a, int b)
    {
        System.out.println(("Division:"+(a/b)));
    }
    static void mod(int a, int b)
    {
        System.out.println("Modulus:"+(a%b));
    }

}
