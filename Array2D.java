
public class Array2D{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}