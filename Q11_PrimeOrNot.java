//Task11:Program to check given number is prime or not.
import java.util.*;
public class Q11_PrimeOrNot
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter a number:");
            int num = obj.nextInt(),c=1;
            for(int i =2;i<=num;i++)
            {
                if(num%i==0)
                    c++;
            }
            if(c==2)
                System.out.println(num+" is prime number");
            else
                System.out.println(num+" is not a prime number");
            obj.close();
        }
}
