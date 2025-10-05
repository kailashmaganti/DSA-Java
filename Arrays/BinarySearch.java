import java.util.Scanner;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i<n;i++)
        {
            a[i]=Sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int target =Sc.nextInt();
        int low=0,high=a.length-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==target)
            {
                System.out.println("element found at index "+mid);
                break;
            }
            else if(a[mid]<target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(low>high)
        {
            System.out.println("element not found ");
        }
        Sc.close();
    }
}
