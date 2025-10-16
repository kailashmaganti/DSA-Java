import java.util.Scanner;
public class factFunction
{

    public static int factorial (int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter a number");
        int num=Sc.nextInt();
        System.out.println("the factorial is :"+factorial(num));
        Sc.close();
    }

}