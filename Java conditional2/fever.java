import java.util.Scanner;

public class fever {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fv=sc.nextInt();
        if(fv>=100)
            System.out.println(fv+"\n"+"High Fever");
       
        else 
            System.out.println(fv+"\n"+"No Fever");
    }
}
