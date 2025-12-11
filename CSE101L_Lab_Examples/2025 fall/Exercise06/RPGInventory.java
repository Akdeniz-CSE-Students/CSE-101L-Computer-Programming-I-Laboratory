import java.util.Arrays;

public class RPGInventory {

    static int[] inventory = {101, 505, 202}; 
    
    public static void lootItem(int newItemID){
     int[] ab =new int[inventory.length+1];   
        
     for(int i=0;i<inventory.length;i++){
         ab[i]=inventory[i];
     }
     
        ab[inventory.length]=newItemID;
        
        inventory=ab;
    }
    
    public static void dropItem(int itemToRemove){
      int[] ba= new int[inventory.length-1];
      
      int in=-1;
      int k=0;
      
      for(int a=0;a<inventory.length;a++){
          if(itemToRemove==inventory[a]){
              in=a;
          }
      }
      
      if(in==-1){
          return;
      }
      
      for(int i=0;i<inventory.length;i++){
          if(i==in){
              continue;
          }
          ba[k]=inventory[i];
          k++;
      }  
      inventory=ba;
        
    }
    
    public static double calculateTotalWeight(){
       double agirlik=0;
       
       for(int i=0;i<inventory.length;i++){
           if(inventory[i]<=199&&inventory[i]>=100){
               agirlik+=5.0;
           }else if(inventory[i]<=299&&inventory[i]>=200){
               agirlik+=10.0;
           }else{
                   agirlik+=1;
           }
           }
                
                return agirlik;
    }
  
    public static void main(String[] args) {
        System.out.println("--- START ---");

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight()); 

        System.out.println("\n--- LOOTING RING (550) ---");

        lootItem(550);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING SHIELD (202) ---");
        dropItem(202);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING MISSING ITEM (999) ---");
        dropItem(999);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());
    }
}
