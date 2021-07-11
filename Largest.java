import java.util.Scanner;
public class Largest
{
    public static void main(String[] args) 
    {
        int num1, num2, num3;
        Scanner large = new Scanner(System.in);
        System.out.println("Enter first num:");
        num1 = large.nextInt();
        System.out.println("Enter second num:");
        num2 = large.nextInt();
        System.out.println("Enter third num:");
        num3 = large.nextInt();
        if(num1 > num2 && num2 > num3)
        {
            System.out.println("Large number is:"+num1);
        }
        else if(num2 > num3)
        {
            System.out.println("Large number is:"+num2);
        }
        else
        {
            System.out.println("Large number is:"+num3);
        }
 
    }
}
