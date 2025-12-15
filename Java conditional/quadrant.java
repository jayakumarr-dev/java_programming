import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("The point lies in the First Quadrant.");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("The point lies in the Second Quadrant.");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("The point lies in the Third Quadrant.");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("The point lies in the Fourth Quadrant.");
        } 
        else if (x == 0 && y == 0) {
            System.out.println("The point lies at the Origin.");
        } 
        else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } 
        else {
            System.out.println("The point lies on the X-axis.");
        }
    }
}
