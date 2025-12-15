import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int strpin=9090;
        int pin=sc.nextInt();
        if(pin==strpin)
            System.out.println("Entered correct pin");
        else 
            System.out.println("incorrect pin");
    }
}
