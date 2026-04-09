import java.util.Scanner;
public class Assignment1 {  
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        boolean inputsAreValid = true;
        String name;
        int elemental = 0;
        int potential = 0;
        int destiny = 0;
        String elementString = "";
        String potentialString = "";

        System.out.print("--- Welcome to the Digital Monster Creation Arena ---");
        System.out.print("\nLet's create your first monster. Give it a cool name:");
        name = scanner.nextLine();

         System.out.print("\nNow, choose your monster's element. This choice will determine its core strength."
          + "\n[1] Fire (Attack-oriented)"
          + "\n[2] Water (Health-oriented)"
          + "\n[3] Earth (Defense-oriented)"
          + "\nYour choice (1-3): ");
        elemental = scanner.nextInt();

        if (elemental == 1) {
            elementString = "Fire";
        } else if (elemental == 2) {
            elementString = "Water";
        } else if (elemental == 3) {
            elementString = "Earth";
        } else {
            System.out.print("ERROR: Invalid element choice. Exiting program.");
            inputsAreValid = false;
        }

        if (inputsAreValid) {
        System.out.print("\nEvery monster has a potential. Choose its potential: "
           + "\n[1] Normal (Standard stats)"
           + "\n[2] Rare (Bonus to all stats)"
           + "\nYour choice (1-2): ");
            potential = scanner.nextInt();

            if (potential == 1) {
                potentialString = "Normal";
            } else if (potential == 2) {
                potentialString = "Rare";
            } else {
                System.out.print("ERROR: Invalid potential choice. Exiting program.");
                inputsAreValid = false;
            }
        }

        if (inputsAreValid) {
            System.out.print("\nFinally, enter a number between 1 and 10 to influence its destiny: ");
            destiny = scanner.nextInt();

            if (destiny < 1 || destiny > 10) {
                System.out.print("ERROR: Destiny Number must be between 1 and 10. Exiting program.");
                inputsAreValid = false;
            }
        }

        if (inputsAreValid) {   
            int hp = 50;
            int ap = 10;
            int dp = 5;

            if (elemental == 1) {
                ap = ap + 5;
            } else if (elemental == 2) {
                hp = hp + 20;
            } else if (elemental == 3) {
                dp = dp + 10;
            }
            if (potential == 2) {
                hp = hp + 10;
                ap = ap + 10;
                dp = dp + 10;
            }
            if (elemental == 1) {
                ap = ap + destiny;
            } else if (elemental == 2) {
                hp = hp + destiny;
            } else if (elemental == 3) {
                dp = dp + destiny;
            }
            
            System.out.print("\nExcellent choices! Your monster "+name+" is being created...\n");
            System.out.print("\n--- MONSTER PROFILE CARD ---");
            System.out.print("\nName: " + name);
            System.out.print("\nElement: " + elementString);
            System.out.print("\nPotential: " + potentialString);
            System.out.print("\n\nHealth Points (HP): " + hp);
            System.out.print("\nAttack Power (AP): " + ap);
            System.out.print("\nDefense Power (DP): " + dp);
            System.out.print("\n---------------------------");
    }
    } 
}
