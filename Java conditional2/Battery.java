import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bat=sc.nextInt();
        if(bat<=20)
            System.out.println(bat+"\n"+"Low Battery");
        else if(bat>20 && bat<80)
            System.out.println(bat+"\n"+"50% Consumed");
        else 
            System.out.println(bat+"\n"+"Battery Full");
    }
}
