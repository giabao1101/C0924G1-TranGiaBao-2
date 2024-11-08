package ss3_array_and_method;

import java.util.Scanner;
import java.util.Arrays;

public class Delete_Element {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         System.out.println("Initial array: " + Arrays.toString(array));


         System.out.println("Enter the element to be deleted: ");
         int elementToRemove = sc.nextInt();

         int indexToRemove = -1;
         for (int i = 0; i < array.length; i++) {
             if (array[i] == elementToRemove) {
                 indexToRemove = i;
                 break;
             }
         }

         if (indexToRemove == -1) {
             System.out.println("Element not found!");
         }
         else {
             array = removeElement (array, indexToRemove);
             System.out.println("Element " + elementToRemove + " was deleted and new array is " + Arrays.toString(array));
         }
         sc.close();
     }
     public static int[] removeElement (int[] array, int index) {
         for (int i = index; i < array.length - 1; i++) {
             array[i] = array[i + 1];
         }
         return Arrays.copyOf(array, array.length - 1);
     }
}
