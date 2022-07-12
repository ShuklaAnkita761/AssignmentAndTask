//Task15:	Program to find count of all factors of given number.
import java.util.Scanner;
public class Q15_countFactors
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the number for which need to count factor:");
            int num = obj.nextInt(),count=0;
            System.out.print("Total number of factors of "+num+" is:");
            if(num>0)
            {
                for(int i =1;i<=num;i++)
                {
                    int rem = num%i;
                    if(rem==0)
                        count++;
                }
                System.out.println(count);
            }
            else
            {
                for(int i =-1;i>=num;i--)
                {
                    int rem = num%i;
                    if(rem==0)
                        count++;
                }
                System.out.println(count);
            }
            obj.close();
        }
}
