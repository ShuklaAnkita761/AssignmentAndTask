//Task 12:Program to print all prime numbers between given range.
import java.util.Scanner;
public class Q12_PrimeNumBet
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the starting number:");
            int num1=obj.nextInt();
            System.out.print("Enter the End number:");
            int num2=obj.nextInt();
            System.out.println("Prime number between:"+num1 +" and "+ num2);
            for(int i = num1+1;i<num2;i++)
            {
                int c=1;
                for(int j =2;j<=i;j++)
                {
                    if(i%j==0)
                        c++;
                }
                if(c==2)
                    System.out.print(i+" ");

            }
            obj.close();
        }
}
