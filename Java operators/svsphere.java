import java.util.Scanner;

public class svsphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double sa=4*(Math.PI)*r*r;
        double vol=1.34*Math.PI*r*r*r;
        System.out.println(sa+"\n"+vol);

    }
}
