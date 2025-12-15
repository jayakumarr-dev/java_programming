import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if (marks<0 || marks>100){
            System.out.println("Invalid marks");
        }else{
        switch(marks/10){
            case 10:
                case 9:
                    case 8 :System.out.println("A grade");
                    break;
                    case 7:
                        case 6:
                                System.out.println("B grade");
                                break;
                                case 5:
                                    case 4:
                                        System.out.println("C grade");
                                        break;
                                        default:
                                            System.out.println("Fail");
        }
    }
}

        }

        