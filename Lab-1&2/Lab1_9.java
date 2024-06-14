//LAvb1_9 C
//9. WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].


import java.util.*;
public class Lab1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of seconds: ");
        int totalSeconds = sc.nextInt();
    
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}