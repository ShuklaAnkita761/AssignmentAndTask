//Task 21Find the greater between four numbers using Nested Conditional Operator.
import java.util.Scanner;
public class Q21_GreaterIn4Num
{
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter four number for checking which one is greater::");
        int num = obj.nextInt();
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
        int res= (num>num1 && num>num2 && num>num3)?num:((num1>num2 && num1>num3)?num1:(num2>num3?num2:num3));
        System.out.println("Greatest number is:"+res);
    }

}
