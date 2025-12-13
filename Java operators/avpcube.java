import java.util.Scanner;

public class avpcube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sa=6*a*a;
        int vol=a*a*a;
        int per=12*a;
        System.out.println(sa+"\n"+vol+"\n"+per);

    }
}
