import java.util.Scanner;

public class Power_6{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int base = sc.nextInt();
        int power = sc.nextInt();

        double ans = 1;

        for(int i=1; i<=power; i++){
            ans *= base;
        }

        System.out.println("Anser is "+ans);


    }
}
