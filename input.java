import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter your Name:");
    String Name=scn.nextLine();
    System.out.println("Enter roll No");
    int Roll_No=scn.nextInt();
    System.out.println("Enter your Grade(,A,B,C,etc):");
    char grade=scn.next().charAt(0);
    System.out.println("Enter your phone Number:");
    long Phone_no=scn.nextLong();
    System.out.println("Enter your CGPA:");
    double cgpa = scn.nextDouble();

    System.out.println("Name:"+Name+"\nRoll No:"+ Roll_No + "\nGrade:"+grade + "\nPhone Number:"+Phone_no+"\nCGPA:"+cgpa);

    } 
}
