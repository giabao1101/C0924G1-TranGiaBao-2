package ss3_array_and_method;
import java.util.Scanner;

public class Merge_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter the size of the array 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the elements of the array 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + i + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the array 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + i + ": ");
            array2[i] = sc.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        System.out.println("Merged Array is: ");
        printArray(mergedArray);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
