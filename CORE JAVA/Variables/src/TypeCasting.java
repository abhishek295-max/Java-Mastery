public class TypeCasting
{
    public static void main(String args[])
    {
        int number=20;

        double num=number;

        System.out.println("Integer value: "+number);
        System.out.println("Double value: "+num);

        // manual typecasting
        double num1=20.5;
        int number1=(int)num1;
        System.out.println("Double value: "+num1);
        System.out.println("Integer value: "+number1);
    }
}
