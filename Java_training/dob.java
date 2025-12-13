import java.util.Scanner;

public class dob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yy=sc.nextInt();
        System.out.printf("%02d/%02d/%04d",dd,mm,yy);
    }
}
