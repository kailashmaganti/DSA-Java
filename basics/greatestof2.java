import java.util.Scanner;
class greatestoftwo
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greateer than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
        Sc.close();

    }
}