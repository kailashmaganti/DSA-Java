import java.util.Scanner;
public class sum
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=Sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    System.out.println("sum="+sum);
    Sc.close();}
}
