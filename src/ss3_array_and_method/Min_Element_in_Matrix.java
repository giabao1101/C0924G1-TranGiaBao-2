package ss3_array_and_method;
import java.util.Scanner;

public class Min_Element_in_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows of the matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of the matrix");
        int columns = sc.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        double min = matrix[0][0];
        int minrow = 0;
        int minCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minrow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("The max element is " + min);
        System.out.println("The position of max element is: (" + minrow + "," + minCol + ")");
    }
}
