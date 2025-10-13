import java.util.Scanner;
class sumoftwo
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        System.out.println("the sum is "+(a+b));
        Sc.close();

    }
}