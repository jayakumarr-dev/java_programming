import java.util.Scanner;

public class salary {
     public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int bs=sc.nextInt();
      int ppa=sc.nextInt();
      int ins=sc.nextInt();
      double insper=(ins*bs)/100;
      double ppaper=(ppa*bs)/100;
      double netsal=bs-insper-ppaper;
      System.out.println(netsal);
}
}
