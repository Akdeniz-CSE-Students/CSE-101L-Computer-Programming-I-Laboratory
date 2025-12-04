import java.util.Scanner;

public class CollatzHypothesis {
public static void main(String[] agrs){
    Scanner scan=new Scanner(System.in);
    System.out.print("Please enter a positive starting number (n): ");
    int startnum=scan.nextInt();
    if(startnum<1){
        System.out.print("Please enter a number greater than 0.");
        return;
    }
    System.out.print(" \nStarting the Collatz sequence for '"+startnum+"':\n");
    int i=startnum;
    int stepCounter=0;
    System.out.print(startnum+" ");
    while(i>1&&i>0){
        if(i%2==0){
            System.out.print((i/2)+" ");
            i=i/2;
        }else if(i%2==1){
            System.out.print((i*3+1)+" ");
            i=i*3+1;
        }
        stepCounter++;
    }
    System.out.print("\nProcess completed!\n");
    System.out.print("The sequence reached 1 in a total of "+stepCounter+" steps.");
    
    
    
    
    scan.close();
}
}