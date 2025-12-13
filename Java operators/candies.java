import java.util.*;
public class candies{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int people=sc.nextInt();
        int distributed=people/candies;
        int remaning=people%candies; 
        System.out.println(distributed);
        System.out.println(remaning);
    }
}