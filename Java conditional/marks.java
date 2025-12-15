import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=35)
            System.out.println(mark+"\n"+"Pass");
       
        else 
            System.out.println(mark+"\n"+"Fail");
    }
}
