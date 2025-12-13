import java.util.Scanner;

public class simpleinterest {
    
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int p=sc.nextInt();
      int r=sc.nextInt();
      int t=sc.nextInt();
      double SI=(p*r*t)/100;
      System.out.println(SI);
   }
}

