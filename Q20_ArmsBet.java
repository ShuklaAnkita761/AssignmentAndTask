//Task20	JAVA Program to Display Armstrong Number between Two Intervals.
import java.util.Scanner;
public class Q20_ArmsBet
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter lower limit: ");
            int num = obj.nextInt();
            System.out.println("Enter upper limit:");
            int num1 = obj.nextInt(), sum = 0;
            System.out.println("Armstrong numbers are:");
            for (int i = num; i <= num1; i++)
            {
                int n = i, m = i, count = 0;
                while (n > 0)
                {
                    ++count;
                    n = n / 10;
                }
                sum = 0;
                while (m != 0)
                {
                    int rem = m % 10;
                    sum = sum + (int) (Math.pow(rem, count));
                    m = m / 10;
                }
                if (i == sum)
                    System.out.print(sum + " ");
            }
        }
}

