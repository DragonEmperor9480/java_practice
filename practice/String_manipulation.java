
import java.util.Scanner;

public class String_manipulation {
public static void main(String[] args) 
    {    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    String str_upperCase = str.toUpperCase();
    String str_lowerCase = str.toLowerCase();
    String str_reverse= "";
    //Reversing the string
    for(int i = str.length()-1; i>=0;i--)
    {
        str_reverse = str_reverse+str.charAt(i);
    }
    System.out.println("UpperCase String: "+str_upperCase);
    System.out.println("LowerCase String: "+str_lowerCase);
    System.out.println("Reversed String: "+str_reverse);
    if (str.equals(str_reverse))
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not Palindrome");
    }


    
}
}
