import java .util.Scanner;;
public class threedigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        
        if(a>99 && a<1000)
            System.out.println("The number is 3 digit");
        else
            System.out.println("The number is not 3 digit");
}
}