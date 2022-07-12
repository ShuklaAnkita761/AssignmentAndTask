//Task16: Program to find all prime factors of given number.
import java.util.Scanner;
public class Q16_primeFactors
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the number for which need to find prime factor:");
            int num = obj.nextInt();
            System.out.println("Prime factors of "+num+" are:");
            for(int i =2;i<=num;i++)
            {
                while(num%i==0)
                {
                    System.out.print(i+" ");
                    num = num/i;
                }
            }
            obj.close();
        }
}
