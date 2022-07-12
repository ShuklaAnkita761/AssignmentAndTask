//task 19 JAVA program to check given number is Armstrong or not
import java.util.Scanner;

public class Q19_ArmsOrNot
{
    public static void main(String[] args)
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter number for checking number is Armstrong or not:");
      int num = obj.nextInt(),m=num,n=num;
      int c=0,sum=0;
      while(n!=0) {
          n = n / 10;
          c++;
      }
      //System.out.println(c);
      while(num!=0)
      {
          int rem = num%10,mul=1;
          for(int i =0;i<c;i++)
          {
              mul= mul* rem;
          }
          sum=sum+mul;
          num=num/10;
      }
     // System.out.println(sum);
      if(m==sum)
          System.out.println(m+" is a Armstrong number");
      else
          System.out.println(m+" is not Armstrong number");
    }
}
