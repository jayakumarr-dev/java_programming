import java.util.Scanner;

public class typetri {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a==b && b==c)
            System.out.println("equilateral triangle");
        else if(a==b || b==c || c==a)
            System.out.println("Isoceles triangle");
        else
            System.out.println("Scalene triangle");
    }
}
