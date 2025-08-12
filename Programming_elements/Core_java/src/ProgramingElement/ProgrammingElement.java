package ProgramingElement;

import java.util.Scanner;

public class ProgrammingElement {

    public static void main(String[] args) {

        final double SALES_TAX_RATE = 0.07;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

        System.out.print("Enter the quantity of items you are buying: ");
        int itemQuantity = input.nextInt();

        System.out.print("Enter the price per item: ");
        double itemPrice = input.nextDouble();

        double subtotal = itemQuantity * itemPrice;

        double taxAmount = subtotal * SALES_TAX_RATE;

        double finalTotal = subtotal + taxAmount;

        int totalInWholeDollars = (int) finalTotal;

        System.out.println("\n--- Receipt for " + userName + " ---");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales Tax (" + (SALES_TAX_RATE * 100) + "%): $" + taxAmount);
        System.out.println("--------------------------");
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Final Total (in whole dollars only): $" + totalInWholeDollars);

        input.close();
    }
}

