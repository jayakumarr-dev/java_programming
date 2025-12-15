import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        if(unit>0 && unit<=100)
            System.out.println("Free");
        else if(unit>100 && unit<=300)
            System.out.println(unit*5+" Per unit Rs.5");
        else
            System.out.println(unit*10+" Per unit Rs.10");
}
}