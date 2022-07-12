//task 18	JAVA program to reverse the given number.
import java.util.Scanner;
public class Q18_reverseNumber
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number which want to reverse:");
        int num = obj.nextInt(),sum=0,n=num;
        while(num!=0)
        {
            sum = sum*10+num%10;
            num= num/10;
        }
        System.out.println("Reverse of "+ n+" is: "+sum);
    }
}
