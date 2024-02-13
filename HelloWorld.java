//Printing prime numbers in a given range
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter range");
         int n=sc.nextInt();
         System.out.println("Prime numbers in given range :");
        for(int i=2;i<=n;i++)
        {
            int check=0;
        for(int j=2;j<=(i/2);j++)
        {
            if(i%j==0)
            {
            check=1;
            }
        }
        if(check==0)
        {
            System.out.println(i);
        }
        }
        
    }
}