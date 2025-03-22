class prime_no{
    public static void main(String args[]){
        //Printing prime numbers from 1 to 100
        int i,j,flag;
        for(i=1;i<=100;i++)
        {
            flag=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                }

            }
            if(flag==2)
            {
                System.out.println(i);
            }
        }
    }
}