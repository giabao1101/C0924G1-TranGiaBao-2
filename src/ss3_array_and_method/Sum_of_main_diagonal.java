package ss3_array_and_method;
import java.util.Scanner;

public class Sum_of_main_diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while (true) {
            System.out.print("Nhập kích thước của ma trận vuông (số nguyên dương): ");
            String input = scanner.nextLine();
            if (isValidInteger(input)) {
                size = Integer.parseInt(input);
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Kích thước ma trận phải là số nguyên dương. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập một số nguyên dương.");
            }
        }

        double[][] matrix = new double[size][size];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                while (true) {
                    System.out.print("Phần tử tại (" + i + ", " + j + "): ");
                    String input = scanner.nextLine();
                    if (isValidDouble(input)) {
                        matrix[i][j] = Double.parseDouble(input);
                        break;
                    } else {
                        System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập một số thực.");
                    }
                }
            }
        }

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);

        scanner.close();
    }

    private static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

