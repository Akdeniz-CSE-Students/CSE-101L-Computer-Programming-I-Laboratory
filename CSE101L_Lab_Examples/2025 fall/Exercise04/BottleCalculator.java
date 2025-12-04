import java.util.Scanner;

public class BottleCalculator {

    public static void main(String[] args) {
        
        //Type your code here.
        Scanner scan=new Scanner(System.in);
        System.out.print("Input: numBottles = ");
        int numBottles = scan.nextInt();
        System.out.print("Input: numExchange = ");
        int numExchange = scan.nextInt();
        if(numExchange <= 1){
             System.out.print("Error");
             return;
         }
        int total = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int newBottles = empty/numExchange;
            total += newBottles;
            empty=(empty%numExchange)+newBottles;
        }
     System.out.print("Output: "+ total);   
        
        
        
        
        
        
    }
    
}