import java.util.Scanner;

public class fahrentocels  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fa=sc.nextInt();
        double cel=(fa-32)*5/9;
        System.out.printf("%2f",cel);
    }
}