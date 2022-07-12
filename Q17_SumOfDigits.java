//Task 17	JAVA program to print sum of digits. (eg. 512 = 8)
import java.util.Scanner;
public class Q17_SumOfDigits
{
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for adding each digit of that number:");
        int num = obj.nextInt(),sum=0,n=num;
        while(num!=0)
        {
            sum = sum+num%10;
            num= num/10;
        }
        System.out.println("The sum of digit of " +n+ " is:" + sum);
    }
}
