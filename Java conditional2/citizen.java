import java.util.Scanner;

public class citizen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=60)
            System.out.println(a+"\n"+"Senior Citizen");
        else
            System.out.println(a+"\n"+"Not Senior Citizen");
    }
}
