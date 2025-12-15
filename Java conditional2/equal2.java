import java.util.Scanner;

public class equal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int ld=year%100;
        int fd=year/100;
        if(ld==fd)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
