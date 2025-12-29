package lab5;
public class MatrixRotator {


   public static void main(String[] args) {

        // 3x3 Test Matrix
        int[][] input = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("=== SMART MATRIX ROTATOR TESTS ===\n");
        System.out.println("Original Matrix:");
        printMatrix(input);

        System.out.println("--- Rotating 90 Degrees Right ---");
        int[][] res90 = rotate(input, 90);
        printMatrix(res90);

        System.out.println("--- Rotating 180 Degrees Right ---");
        int[][] res180 = rotate(input, 180);
        printMatrix(res180);

        System.out.println("--- Rotating 270 Degrees Right ---");
        int[][] res270 = rotate(input, 270);
        printMatrix(res270);

        System.out.println("--- Rotating 360 Degrees Right ---");
        int[][] res360 = rotate(input, 360);
        printMatrix(res360);

        System.out.println("--- Rotating 450 Degrees Right ---");
        int[][] res450 = rotate(input, 450);
        printMatrix(res450);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
       public static int[][] rotate(int[][] matrix, int degrees) {
        int leng = matrix.length;
        int steps = (int) Math.round(degrees / 90.0);
        int donusSayisi = steps % 4;

        if (donusSayisi < 0) {
            donusSayisi += 4;
        }

        int[][] currentMatrix = matrix;

        for (int k = 0; k < donusSayisi; k++) {
            int[][] nextMatrix = new int[leng][leng];
            for (int i = 0; i < leng; i++) {
                for (int j = 0; j < leng; j++) {
                    nextMatrix[j][leng - 1 - i] = currentMatrix[i][j];
                }
            }
            currentMatrix = nextMatrix;
        }

        return currentMatrix;
    }
        
        
        
    
}