//Task7: Mr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency.
//So help out Mr. Lalwani to check which currency going to give him 3 times return.
import java.util.*;
public class Q7_Lalwani
{
        public static void main(String[] args)
        {
            // TODO Auto-generated method stub
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter currency");
            int curre= obj.nextInt();
            System.out.println("enter the number");
            int num= obj.nextInt(),sum=0;
            int n =num,temp=n;
            while(n>0)
            {
                int r =n%10;
                sum = (sum*10)+r;
                n = n/10;
            }
            if(temp==sum)
            {
                curre=curre*3;
                ;         System.out.println("Mr lalwani get three times more from this currency  :"+curre);
            }
            else
                System.out.println("Mr.lalwani your currecy is not multiple of 3 so you get "+ curre);
            obj.close();
        }
}
