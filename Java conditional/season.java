import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mnth=sc.nextInt();
        if (mnth<0 && mnth>12){
            System.out.println("Invalid Month");
        }
            else{
                switch (mnth) {
                    case 3:
                        case 4:
                            case 5:
                                System.out.println("Summer Season "+mnth);
                        break;
                        case 6:
                            case 7:
                                case 8:
                                    case 9:
                                        System.out.println("Rainy Season "+mnth);
                                        break;
                                        case 10:
                                            case 11:
                                                case 12:
                                                    case 1:
                                                        case 2:
                                                        System.out.println("Winter Season "+mnth);
                                                        break;
                    default:
                        System.out.println("No Seasons");
                        break;
                }
            }
        }
    }

