import java.util.Scanner;

public class ticket {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>0 && age<12){
            System.out.println("child");
            System.out.println("Ticket price:50");
        }
        else if(age>12 && age<60){
            System.out.println("Adult");
            System.out.println("Ticket price:100");

        }
        else
            System.out.println("Senior"+"\n"+"Ticket price:70");
    }
}