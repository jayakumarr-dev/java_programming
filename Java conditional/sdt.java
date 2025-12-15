import java.util.Scanner;

public class sdt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       
        if (a>=0 && a<10)
            System.out.println("single digit ");
        else if (a>9 && a<100)
            System.out.println(" double digit ");
        else
            System.out.println("three digit");
}
}
