import java.util.*; 
public class Swapnum
{
     public static void main(String []args)
     {
        Scanner swap=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=swap.nextInt();
        System.out.println("Enter the second number");
        int num2=swap.nextInt();
        
System.out.println("Before Swap num are: ");
System.out.println("First Number  "+num1);
System.out.println("Second Number  "+num2);
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;
        System.out.println("After Swap num are: ");
        System.out.println("First Number is "+num1);
        System.out.println("Second Number is "+num2);
     }
}
