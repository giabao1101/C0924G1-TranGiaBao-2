package ss3_array_and_method;
import java.util.Scanner;

public class Sum_Of_Cols {
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

        System.out.print("Enter cols of the matrix to sum: ");
        int colindex = sc.nextInt();

        if (colindex < 0 || colindex >= columns) {
            System.out.println("Invalid column index");
        }
        else {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][colindex];
            }
            System.out.println("Sum of colum " + colindex + "is: " + sum);
        }

    }
}
