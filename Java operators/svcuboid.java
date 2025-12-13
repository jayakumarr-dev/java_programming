import java.util.Scanner;

public class svcuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int sa=2*(l*b+b*h+h*l);
        int vol=l*b*h;
        System.out.println(sa+"\n"+vol);

    }
}
