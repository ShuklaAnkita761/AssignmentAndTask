//Task 24 : Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
//--If driver is married
//--If driver is unmarried male and age above 30
//--If driver is unmarried female and age above 25 otherwise  driver is not insured
import java.util.Scanner;
public class Q24_insurancePolicy
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       char marSta;
       System.out.println("Enter your marital Status as (Married)M or(Unmarried) U:");
       marSta = obj.next().charAt(0);
       if(marSta=='M')
           System.out.println("Congratulations!, you are eligible for insurance policy ");
       else
       {
           System.out.println("Enter your age:");
           int age = obj.nextInt();
           System.out.println("Enter your gender if male (M) and for female  (F)");
           char gender = obj.next().charAt(0);
           if(gender=='M' && age>30)
               System.out.println("Congratulations!, you are eligible for insurance policy");
           else
           {
               if(gender == 'F' && age>25)
                   System.out.println("Congratulations!, you are eligible for insurance policy");
               else
                   System.out.println("Sorry You are NOT eligible for insurance policy ");
           }
       }
    }
}
