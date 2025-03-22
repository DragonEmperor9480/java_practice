public class error_handling {
    public static void main(String[] args) {
        try{
            int a = 5/0; // it wil give error
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
        finally{
            System.out.println("If error is found finally block executes!");
        }

    }
    
}
