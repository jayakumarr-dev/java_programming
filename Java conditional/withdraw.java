import java.util.Scanner;

public class withdraw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=10000;
        int wd=sc.nextInt();
        if(wd<=bal)
            System.out.println(wd+" Validation Withdrawal");
        else
            System.out.println("Insufficient balance");
        if(wd%100!=0)
            System.out.println("Amount should be multiple of 100");

    }
}
