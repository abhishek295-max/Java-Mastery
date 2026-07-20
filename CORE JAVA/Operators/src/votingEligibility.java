import java.util.Scanner;

public class votingEligibility
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();

        String result=(age>=18) ? "Eligible for voting" : "Not eligible for voting";
        System.out.println(result);
    }
}
