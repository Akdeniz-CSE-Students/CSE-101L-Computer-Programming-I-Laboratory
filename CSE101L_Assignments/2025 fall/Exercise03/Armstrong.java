import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Please enter a number: ");
         int number = scan.nextInt();
         int orginalnumber=number;
         int digitcount=String.valueOf(number).length();
         int result=0;
         for(;number!=0;number/=10){
             int digit = number %10;
             result+=Math.pow(digit,digitcount);
         }
         if(result == orginalnumber){
             System.out.print(orginalnumber + " is an Armstrong number.");
         }else{
             System.out.print(orginalnumber + "is not an Armstrong number.");
         }
        
        
        
        
        
        
        
        
        
        
        scan.close();
        
    }
    
}
