import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cx , cy , r , px , py;
        System.out.println("--- Circle Information---");
        System.out.print("Enter the center X coordinate of the circle (cx): ");
        cx = scan.nextDouble();
        System.out.print("Enter the center Y coordinate of the circle (cy): ");
        cy = scan.nextDouble();
        System.out.print("Enter the radius of the circle (r): ");
        r = scan.nextDouble();
        System.out.println("\n---Point Information---");
        System.out.print("Enter the X coordinate of the point (px): ");
        px = scan.nextDouble();
        System.out.print("Enter the Y coordinate of the point (py): ");
        py = scan.nextDouble();
        double distance = Math.sqrt(Math.pow((cx-px),2)+Math.pow((cy-py),2));
        System.out.println("\nCalculated distance: " + distance);
        System.out.println("-------------------------------------");
        if (distance==r){
            System.out.print("Result: The point is exactly on the circle.");
        }
        else if (distance<r){
            System.out.print("Result: The point is inside the circle.");
        }
        else if (distance>r) {
            System.out.print("Result: The point is outside the circle.");
        }
        
        
        scan.close();
        
    }
}