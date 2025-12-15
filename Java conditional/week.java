import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0 || a>7){
            System.out.println("Invalid day");
        }else{
            switch (a) {
                case 1:
                case 2:
                    case 3:
                        case 4:
                            case 5:
                                System.out.println("Weekdays");
                                break;
                                case 6:
                                        case 7:
                                            System.out.println("Weekends");

                    
                    break;
            
                default:
                    System.out.println("No days");
                    break;
            }
        }

    }
}
