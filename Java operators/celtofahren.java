import java.util.Scanner;

public class celtofahren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cel=sc.nextInt();
        double fah=(cel*9)*32/5;
        System.out.println(fah);
    }
}