import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int dis;
        int ac;
        if(a>=1500 && a<=2000){
            dis=(20*a)/100;
            ac=a-dis;
            System.out.println(ac);
        }
       else if(a>=1000 && a<1500){
            dis=(15*a)/100;
            ac=a-dis;
            System.out.println(ac);
       }
        else if(a>=500 && a<1000){
            dis=(10*a)/100;
            ac=a-dis;
            System.out.println(ac);
        }
else{
    System.out.println("No discount");

}

            
    }
}
