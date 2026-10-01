import java.util.*;

public class Input5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // MOVES THE POINTER TO THE NEXT LINE.
        sc.nextLine();
        // So that we can read the next line after reading integers, if not then it will
        // skip the next line and read the current line

        String line = sc.nextLine(); // 1,2,3,4,5

        String[] parts = line.split(","); // ["1", "2", "3", "4", "5"]

        int[][] matrix = new int[rows][cols];

        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[k]);
                k++;
            }
        }

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}