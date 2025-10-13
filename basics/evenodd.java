import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        if(n%2==0)
        {
            System.out.println("it is a even number");

        }
        else
        {
            System.out.println("it is an odd number");
        }
        Sc.close();

    }

}
