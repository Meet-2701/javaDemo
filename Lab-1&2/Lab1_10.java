//Lab 1_10 C
//10. WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1 week and 3 days].

import java.util.*;

public class Lab1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of days");
        int days = sc.nextInt();
        int year = days / 365;
        int week = (days % 365) / 7;
        int day = (days % 365) % 7;
        System.out.println(year+" years, "+week+" weeks, "+day+" days");
    }
}