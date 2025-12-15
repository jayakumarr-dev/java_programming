import java.util.Scanner;

public class productposneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
        int c=a*b;
        if (c>0)
            System.out.println("positive "+c);
        else
            System.out.println("negative "+c);
}
}
