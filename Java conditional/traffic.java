import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        switch(ch){
            case "Red":
                System.out.println("Stop");
                break;
                case "Yellow":
                    System.out.println("Wait");
                    break;
                    case "Green":
                        System.out.println("Go");

        }
    }
}
