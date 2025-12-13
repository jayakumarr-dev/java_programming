import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=(a>20)?"Pass":"Fail";
        System.out.println(b);
    }
}
