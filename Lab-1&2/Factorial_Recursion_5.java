import java.util.Scanner;

public class Factorial_Recursion_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int factorial = multiplying(n);
        System.out.println("Factorial of "+ n +" is "+ factorial);

    }
    public static int multiplying(int n) {
        if(n==0){
            return 1;
        }
        int ans = n * multiplying(n-1);
            return ans;
        }
}