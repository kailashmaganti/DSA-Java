import java.util.Scanner;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of the arrar");
        int n=Sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements pf the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
        }
        System.out.println("enter the element to be searches");
        int target=Sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == target)
            {
                System.out.println("element is found at "+i);
                found=true;
                break;
            }
        }
        if(found!=true)
        {
            System.out.println("element not found ");

        }
        Sc.close();
    }
}