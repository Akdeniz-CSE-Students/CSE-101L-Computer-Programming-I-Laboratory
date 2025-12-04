public class Gallery {
    
    static String[] cars = new String[0]; // Stores car names
    static double[] prices = new double[0]; // Stores car prices
    static double cash = 100000.0; // Gallery cash balance (Starting: 100,000)


    public static void main(String[] args) {
            System.out.println("=== GALLERY SYSTEM STARTING ===\n");
    
            // 1. Initial Status
            status();
    
            // ---------------------------------------------------------
            // TEST 1: STANDARD BUYING AND BUDGET LIMITS
            // ---------------------------------------------------------
            System.out.println("\n--- Test 1: Buying Cars & Draining Budget ---");
            buyCar("Honda Civic", 20000);  // Cash: 80,000
            buyCar("BMW 320i", 45000);     // Cash: 35,000
            
            // Let's try to buy a luxury car that we barely can't afford
            buyCar("Porsche Taycan", 40000); // We have 35k, need 40k. Should FAIL.
            
            // Buy a cheaper car to drain remaining cash
            buyCar("Fiat Egea", 30000);      // Cash: 5,000
            
            // Try buying one more car with very low balance
            buyCar("Toy Car", 6000);         // We have 5k, need 6k. Should FAIL.
    
            status(); 
    
            // ---------------------------------------------------------
            // TEST 2: PROFIT & CASE SENSITIVITY
            // ---------------------------------------------------------
            System.out.println("\n--- Test 2: Selling & Case Sensitivity ---");
            // We have: Honda Civic, BMW 320i, Fiat Egea
            
            // Try selling with different casing (lowercase/uppercase mix)
            // Code uses equalsIgnoreCase, so this MUST succeed.
            sellCar("honda civic"); 
            sellCar("bmw 320I");    
    
            status(); // Cash should have increased significantly due to 20% profit
    
            // ---------------------------------------------------------
            // TEST 3: EMPTYING THE GALLERY (Array Resize to 0)
            // ---------------------------------------------------------
            System.out.println("\n--- Test 3: Selling Everything (Zero Array Size) ---");
            // Only Fiat Egea is left. Let's sell it.
            sellCar("Fiat Egea");
    
            status(); // Should show CAR COUNT: 0 and empty brackets []
    
            // ---------------------------------------------------------
            // TEST 4: EDGE CASES ON EMPTY GALLERY
            // ---------------------------------------------------------
            System.out.println("\n--- Test 4: Invalid Operations on Empty Gallery ---");
            // Try to sell a car when we have none
            sellCar("Ghost Car");
    
            // Try to buy a very expensive car now that we have profit money
            // We started with 100k, bought cars, sold all with profit. 
            // We should have much more than 100k now.
            buyCar("Lamborghini Urus", 110000); 
            
            status(); // Final Check
            
            System.out.println("\n=== GALLERY SYSTEM TESTS COMPLETED ===");
        }
}