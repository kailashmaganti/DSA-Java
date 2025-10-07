import java.util.Scanner;
class selectionsort
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the size of the aray");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0; i<n;i++)
        {
            a[i]=Sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int min=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                };
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("the sorted array is "+a[i]);

        }
        Sc.close();
    }
}