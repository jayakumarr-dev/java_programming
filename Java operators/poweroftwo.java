import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= (a > 0 && (a & (a - 1)) == 0) ? 1 : 0;
        System.out.println(b);
    }
    
}
