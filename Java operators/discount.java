import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int actualprice=sc.nextInt();
        int discountpercent=sc.nextInt();
        int discountamount=(actualprice*discountpercent)/100;
        int finalprice=(actualprice-discountamount);
        System.out.println(finalprice);
    }
}
