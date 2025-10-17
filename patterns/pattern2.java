import java.util.Scanner;
class pattern2
{
    public static void main (String [] args)
    {
        Scanner Sc=new Scanner (System.in);
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        Sc.close();
    }
}