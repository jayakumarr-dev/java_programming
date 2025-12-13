import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=(a>0)?"Postive":"Negative";
        System.out.println(b);
    }
}
