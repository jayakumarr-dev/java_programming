import java.util.Scanner;

public class sameld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int year2=sc.nextInt();
        int ld=year%10;
        int ld1=year2%10;
        if(ld==ld1)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
