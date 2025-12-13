import java.util.Scanner;

public class svcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double sa=2*Math.PI*r*(r+h);
        double vol=Math.PI*r*r*h;
        System.out.println(sa+"\n"+vol);

    }
}
