import java.util.Scanner;

public class phno {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long ph=sc.nextInt();
        
        if(ph>=999999999L && ph<10000000000L)
            System.out.println("Valid phone number");
        else 
            System.out.println("Invalid phone number");
    }
       
}
