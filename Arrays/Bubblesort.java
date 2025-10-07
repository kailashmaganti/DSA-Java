import java.util.Scanner;
class Bubblesort
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =Sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0; i<n;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for(int i=0; i<n-1;i++)
        {
            for (int j=0; j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<n;i++)
        {
            System.out.println("the sorted array is "+arr[i]);

        }
        Sc.close();
        


    }
}
