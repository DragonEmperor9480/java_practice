public class string_equals {
public static void main(String[] args) {
    String s1 = "Demon";
    String s2 = "Demon";
    String s3 = new String("Demon");
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1==s2);
    System.out.println(s1==s3);//false (Different memory location)
}    
}
