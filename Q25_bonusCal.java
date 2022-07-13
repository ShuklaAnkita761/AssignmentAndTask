//Task25  Write a Java program for bonus calculation. Accept basic salary from user. Calculate TA = 10%, DA= 15%,
// HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
// Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
import java.util.Scanner;
public class Q25_bonusCal
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print
                ("Enter your basic salary:");
        double BasicSal = obj.nextInt(),TA = BasicSal*0.1,DA = BasicSal *0.15,HRA = BasicSal * 0.2;
        double PF = BasicSal*0.12,bonus;
        System.out.println("  TA: " +TA);
        System.out.println("  DA: "+DA);
        System.out.println("  HRA: " +HRA);
        System.out.println("  PF: " +PF);
        if(BasicSal>=20000)
        {
            bonus = BasicSal*(0.1);
        }
        else
            bonus = BasicSal*(0.2);
        double totalSal= BasicSal+TA+DA+HRA+bonus-PF;
        System.out.println("  bonus: " +bonus);
        System.out.println("  gross salary is: "+ totalSal);
    }
}
