package com.atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSystem {
    private static double balance = 5000.0;
    private static final String userPIN = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Welcome to ATM System =====");
        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine().trim();

        if (pin.equals(userPIN)) {
            int choice = -1;
            while (choice != 4) {
                try {
                    System.out.println("\n===== Main Menu =====");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.printf("Your current balance is: \u20B9%.2f%n", balance);
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: \u20B9");
                            double deposit = sc.nextDouble();
                            if (deposit > 0) {
                                balance += deposit;
                                System.out.printf("Deposit Successful. New balance: \u20B9%.2f%n", balance);
                            } else {
                                System.out.println("Invalid amount.");
                            }
                            break;
                        case 3:
                            System.out.print("Enter amount to withdraw: \u20B9");
                            double withdraw = sc.nextDouble();
                            if (withdraw > 0) {
                                if (withdraw <= balance) {
                                    balance -= withdraw;
                                    System.out.printf("Withdrawal Successful. Remaining balance: \u20B9%.2f%n", balance);
                                } else {
                                    System.out.println("Insufficient Balance!");
                                }
                            } else {
                                System.out.println("Invalid amount.");
                            }
                            break;
                        case 4:
                            System.out.println("Thank you for using ATM. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice, try again.");
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Input error: please enter numeric values where required.");
                    sc.nextLine();
                }
            }
        } else {
            System.out.println("Invalid PIN! Access Denied.");
        }
        sc.close();
    }
}
