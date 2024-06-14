//lab 1_12 -C
//12. WAP to print Armstrong number from 1 to 1000.

import java.util.Scanner;

public class Lab1_12 {

    public static boolean isArmstrong(int num) {
        int a = num;
        int count = 0;
        while (a > 0) {
            int r = a % 10;
            count += 1;
            a /= 10;
        }
        int sum = 0;
        a = num;
        while (a > 0) {
            int r = a % 10;
            sum += Math.pow(r, count);
            a /= 10;
        }
        if (sum != num)
            return false;
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

}