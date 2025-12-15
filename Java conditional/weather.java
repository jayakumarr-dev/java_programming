import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wer=sc.nextInt();
        
        if(wer<10)
            System.out.println(wer+": cold");
        else if(wer>=10 && wer<20)
            System.out.println(wer+": pleasant");
        else if(wer>=20 && wer<34)
            System.out.println(wer+": hot");
        else
            System.out.println(wer+": heatwave");
    }
}
