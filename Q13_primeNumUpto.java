//Task13: Program to print count of all prime numbers upto given number.
import java.util.Scanner;
public class Q13_primeNumUpto
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the upper limit:");
            int num1 = obj.nextInt(), co = 0;
            System.out.println("Prime number upto " + num1 + " are: ");
            for (int i = 1; i < num1; i++)
            {
                int c = 1;
                for (int j = 2; j <= i; j++)
                {
                    if (i % j == 0)
                        c++;
                }
                if (c == 2)
                    co++;
            }
            System.out.println(co);
            obj.close();
        }
}
