import java.util.Scanner;

public class right {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if((a*a+b*b==c*c)||(b*b+c*c==a*a)||(c*c+a*a==b*b))
            System.out.println("right angeled triangle");
       
        else
            System.out.println("not tight angeled triangle");
    }
}
