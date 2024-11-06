package ss2_loop;
import java.util.Scanner;

public class Print_Geometric_Shapes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle(scanner);
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Print a rectangle
    public static void printRectangle() {
        int width = 5;
        int height = 3;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print a square triangle with different angles
    public static void printSquareTriangle(Scanner scanner) {
        System.out.println("Choose the corner position for the square triangle:");
        System.out.println("1. Top-left");
        System.out.println("2. Top-right");
        System.out.println("3. Bottom-left");
        System.out.println("4. Bottom-right");
        System.out.print("Enter your choice: ");
        int position = scanner.nextInt();
        int height = 5;

        switch (position) {
            case 1: // Top-left
                for (int i = height; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2: // Top-right
                for (int i = height; i > 0; i--) {
                    for (int j = 0; j < height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3: // Bottom-left
                for (int i = 1; i <= height; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4: // Bottom-right
                for (int i = 1; i <= height; i++) {
                    for (int j = 0; j < height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid position. Returning to main menu.");
        }
    }

    // Print an isosceles triangle
    public static void printIsoscelesTriangle() {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
