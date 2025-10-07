import java.util.Scanner;
class insertionsort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1; i<n;i++)
        {
            int current =a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>current)
            {
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=current;

        }
        for(int i=0; i<n;i++)
        {
            System.out.println("the sorted arry is"+a[i]);

        }
        sc.close();
        
    }
}