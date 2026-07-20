import java.util.Scanner;

public class Salary_Increment
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();

        System.out.println("Salary after increment: "+(salary+(salary*10/100)));
    }
}
