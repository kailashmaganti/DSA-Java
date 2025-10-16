import java.util.Scanner;

public class primefunction {
    public static void prime(int n) {
        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime==true)
        {
            System.out.println("It is a prime number");
        }
        
        else
            System.out.println("It is not a prime number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        prime(n);
        sc.close();
    }
}
