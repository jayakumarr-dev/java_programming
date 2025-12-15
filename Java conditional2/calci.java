import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        char ch =sc.next().charAt(0);
        switch(ch){
            case'+'->
            System.out.println(a+b);
            case'-'->
            System.out.println(a-b);
            case '*'->
                System.out.println(a*b);
                case '/'->{
                    if (b!=0)
                    System.out.println(a/b);
                }
                    case '%'->{
                        if(b!=0)
                        System.out.println(a%b);
                    }
                        default->
                            System.out.println("Invalid operator");


        }

    }
}
