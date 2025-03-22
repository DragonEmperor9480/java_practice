public class Introduction_To_Arrays{
    public static void main(String[] args) {

        //Method 1 
        int Month_Days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //Method 2
        int Week_Days[] = new int[8];

        for (int i =0;i<12;i++)
        {
            System.out.println(Month_Days[i]);
        }

    }
}