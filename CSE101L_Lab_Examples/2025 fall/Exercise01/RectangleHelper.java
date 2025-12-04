import java.util.Scanner;

public class RectangleHelper{
    public static void main(String[] args){
        
    // Write your code here.    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Ente height: ");
        int height = input.nextInt();
        int Area = width * height;
        System.out.println("Area:" + Area);
        int Perimeter = width * 2 + height * 2;
        System.out.println("Perimeter: " + Perimeter);
        
        
        
    // 1) Create a Scanner to read from the keyboard
    
    
    // 2) Ask for width and height
    
    
    // 3) Compute area and perimeter
    
    
    // 4) Print results
    
    
    // 5) Close the scanner (good habit)
    input.close();
        
    
    }
}