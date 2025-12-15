import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int spd=sc.nextInt();
        
        if(spd>=100)
            System.out.println("speed exceeds 100");
        else 
            System.out.println("speed on limit");
    }
}
