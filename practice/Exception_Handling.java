public class Exception_Handling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try{
            c = a/b;
        }
        catch(Exception e)
        {
            System.out.println("Error Occured: "+e);
        }
    }
    
}
