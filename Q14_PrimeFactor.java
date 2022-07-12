//Task 14:Program to find all factors of the given number.
import java.util.Scanner;
public class Q14_PrimeFactor
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the number for which need to find factor:");
            int num = obj.nextInt();
            System.out.print("Factors of " + num + " are:");
            if (num > 0)
            {
                for (int i = 1; i <= num; i++)
                {
                    int rem = num % i;
                    if (rem == 0)
                        System.out.print(i + " ");
                }
            }
            else
            {
                for (int i = -1; i >= (num); i--)
                {
                    int rem = num % i;
                    if (rem == 0)
                        System.out.print(i + " ");
                }
            }
            obj.close();
        }
}
