package ss3_array_and_method;

import java.util.Scanner;
import java.util.Arrays;


public class Add_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Elements in array: ");
        for (int i  : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.print("Enter the value to insert: ");
        int valueToInsert = sc.nextInt();
        System.out.println("Enter the position to insert (from 0 to " + n + "): ");
        int position = sc.nextInt();

        if (position < 0 || position > n) {
            System.out.println("Invalid position");
        }
        else {
            arr = insertElement(arr, valueToInsert, position);
            System.out.println("Array after insertion: " + Arrays.toString(arr));
        }
        sc.close();
    }

    public static int[] insertElement (int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = value;
        for (int i = position; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

}


