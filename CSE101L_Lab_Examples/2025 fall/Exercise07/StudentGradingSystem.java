public class StudentGradingSystem {

    public static void main(String[] args) {
        
        // ==========================================
        // SCENARIO 1: Standard Class (3 Exams)
        // ==========================================
        System.out.println("==========================================");
        System.out.println("TEST SCENARIO 1: Standard Class");
        System.out.println("=========================================="); 
        
        String[] classA_names = {"Alice", "Bob", "Charlie"};
        int[][] classA_grades = {
            {50, 60, 70},   // Lowest (50) dropped -> Avg: 65.0
            {40, 40, 40},   // Lowest (40) dropped -> Avg: 40.0
            {90, 100, 80}   // Lowest (80) dropped -> Avg: 95.0
        };
        
        // Running the system with Class A data
        runGradingSystem(classA_names, classA_grades);


        // ==========================================
        // SCENARIO 2: Larger Group & Edge Cases
        // ==========================================
        System.out.println("\n\n==========================================");
        System.out.println("TEST SCENARIO 2: Large Group & Edge Cases");
        System.out.println("==========================================");
        
        String[] classB_names = {"David", "Eve", "Frank", "Grace", "Heidi"};
        int[][] classB_grades = {
            {10, 20, 10, 20},   // Mixed low scores
            {100, 90, 95, 100}, // High performer
            {50, 50, 50, 50},   // Exact pass limit (50.0)
            {60, 70, 60, 70},   // Average student
            {0, 0, 0, 0}        // All zeros (Edge case)
        };

        // Running the system with Class B data
        runGradingSystem(classB_names, classB_grades);
    }

    public static void runGradingSystem(String[] names, int[][] grades) {
        System.out.println("\n--- DETAILED CLASS LIST ---");
        printClassList(names, grades);

        System.out.println("\n--- CLASS PERFORMANCE ANALYSIS ---");
        analyzeClassPerformance(grades);

        System.out.println("\n--- TOP STUDENT ---");
        String topStudent = findTopStudent(names, grades);
        System.out.println("Congratulations: " + topStudent);
    }
    public static double calculateAverage(int[] scores){
    if (scores == null || scores.length < 2) {
    return 0.0;
     }
    
    double min=scores[0];
    double sum=0;
         
    for(int i=0;i<scores.length;i++){
        if(scores[i]<min){
            min=scores[i];
        }
        sum+=scores[i];
    }
 
    return (sum-min)/(scores.length-1);
}    
    
public static String findTopStudent(String[] names, int[][] grades){
 double maxAverage = -1.0;
 String topName = "";
 
 for (int i = 0; i < names.length; i++) {
        double currentAvg = calculateAverage(grades[i]); 
        if (currentAvg > maxAverage) {  
            maxAverage = currentAvg;
            topName = names[i];
        }
    } 
    return topName;
}     
    
public static void analyzeClassPerformance(int[][] grades){
  double sumOfAverages = 0;
    int failCount = 0;
    
    for (int i = 0; i < grades.length; i++) {
       
        double avg = calculateAverage(grades[i]);

        sumOfAverages += avg;

        if (avg < 50.0) {
            failCount++;
        }
    }

     double generalAverage = sumOfAverages / grades.length;

    System.out.printf("Class General Average: %.2f\n", generalAverage);
    System.out.println("Number of Failed Students: " + failCount); 
 
}    
    
public static void printClassList(String[] names, int[][] grades){
  for (int i = 0; i < names.length; i++) {
        
       double avg = calculateAverage(grades[i]);
        
         System.out.printf("Student: %-10s | Average: %.1f\n", names[i], avg);
    }  
}    

}