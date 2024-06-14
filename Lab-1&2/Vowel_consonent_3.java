import java.util.Scanner;

public class Vowel_consonent_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if(a=='A' ||a=='E' ||a=='I' ||a=='O' ||a=='U' ||a=='a'||a=='e' ||a=='o' ||a=='i' || a=='u' ){
            System.out.println("Character is Vowel");
        }
        else{
            System.out.println("Character is consonent");
        }

    }
}