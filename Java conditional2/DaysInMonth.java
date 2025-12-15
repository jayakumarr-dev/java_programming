import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
        } else {
            int days;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (month == 2)
                    days = 29;
                else if (month == 4 || month == 6 || month == 9 || month == 11)
                    days = 30;
                else
                    days = 31;
            } else{
                if (month == 2)
                    days = 28;
                else if (month == 4 || month == 6 || month == 9 || month == 11)
                    days = 30;
                else
                    days = 31;
            }
            System.out.println("Number of days: " + days);
        }
    }
}
