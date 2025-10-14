import java.util.Scanner;
public class reverse 
{
    public static void main(String args[])
    {
        int rev;
        int r=0;;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=Sc.nextInt();
        while(n!=0)
        {
            rev=n%10;
            r=(r*10)+rev;
            n=n/10;
        }
        System.out.println("the reversed number is "+r);
        Sc.close();
    
    }
}
