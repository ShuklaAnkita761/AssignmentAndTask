//task 6: Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
//Return the resulting string. Note: input will never be an empty string
import java.util.*;
public class Q6_replace
{
    public static void main(String[] args)
    {
            // TODO Auto-generated method stub
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter the  String");
            String s = obj.nextLine();
            long l = s.length();
            char[] arr = s.toCharArray();
            for(int i =0;i<l;i++)
            {
                if(arr[i]-'0'>0 && arr[i]-'0'<10)
                {
                    if(arr[i]-'0'<5)
                        arr[i]='0';
                    else
                        arr[i]='1';
                }
            }
            System.out.println(arr);
            obj.close();
        }
}
