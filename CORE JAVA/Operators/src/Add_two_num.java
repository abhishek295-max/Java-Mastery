import java.util.Scanner;

public class Add_two_num
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to add: ");

        int a=sc.nextInt();
        int b=sc.nextInt();

        int addition=a+b;

        System.out.printf("The addition of %d and %d is %d",a,b,addition);

    }

}
