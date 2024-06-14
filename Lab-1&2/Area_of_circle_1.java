import java.util.Scanner;

public class Area_of_circle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextInt();

        System.out.println("Area = " + (3.14*radius*radius));
    }
}