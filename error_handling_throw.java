public class error_handling_throw {
    public static void main(String[] args) {
        int age =15;
        if (age<18)
        {
            throw new ArithmeticException("You must be older than 18 to vote");
        }
    }
}
