import java.util.Scanner;

public class waterbill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bill=sc.nextInt();
        if(bill>0 && bill<=1000)
            System.out.println("Free");
        else if(bill>1000 && bill<=2000)
            System.out.println(bill*5+" Per lit Rs.5");
        else
            System.out.println(bill*10+" Per lit Rs.10");
}
}
