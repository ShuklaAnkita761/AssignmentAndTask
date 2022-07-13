//Task26 Write a program to input electricity unit charge and calculate the total electricity bill according to the
// given condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.
import java.util.Scanner;
public class Q26_ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter total unit used:");
        double unit = obj.nextInt(),amt,surCharge;
        if(unit<=50)
        {
            amt = unit*0.50;
        }
        else
        {
            if(unit<=150)
                amt = 25+(unit -50)*0.75;
            else
            {
                if(unit<=250)
                {
                    amt = 25+75+(unit-150)*1.20;
                }
                else
                    amt = 25+75+120+(unit-250)*1.50;
            }
        }
        surCharge = amt*20/100;
        System.out.println("Total electricity bill is :"+(amt+surCharge));
    }
}
