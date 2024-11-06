package ss1_introduce_to_Java;


import java.util.Scanner;

public class Money_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you want to exchange: ");
        int USD = scanner.nextInt();

        if (USD > 0) {
            int VND = 23000 * USD;
            System.out.println("The USD value is " + VND);
        }
        else {
            System.out.println("You don't have enough money.");
        }

    }
}
