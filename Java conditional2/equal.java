import java.util.Scanner;

public class equal {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char cha=sc.next().charAt(0);
        if(ch==cha)
            System.out.println("equal");
        else
            System.out.println(" not equal");
    }
}
