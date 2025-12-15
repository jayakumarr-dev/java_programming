import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float mb=sc.nextFloat();
        int max=1500;
        if(mb>0 && mb<=850)
            System.out.println("Half data consumed "+mb);
        else if(mb>850 && mb<=1449)
            System.out.println("90% completed");
        else if(mb==max)
            System.out.println("100% completed");
        else
            System.out.println("No data available");
}
}
