import java.util.Scanner;

public class Prime_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = isPrime(n);

        if(ans == 1 ){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

    }

    public static int isPrime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }
}
