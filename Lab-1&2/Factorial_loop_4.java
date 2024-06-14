import java.util.Scanner;

public class Factorial_loop_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double factorial = 1; 

        for(int i=n; i>=1; i--){
            factorial *= i;
        }

        System.out.println("Factorial of "+ n +" is "+factorial);
    }
}
