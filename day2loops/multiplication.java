import java.util.Scanner;
public class multiplication 
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=Sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "X"+i+ "=" +(n*i));

        }
        Sc.close();
    }
}
