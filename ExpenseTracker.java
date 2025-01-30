import java.util.ArrayList;
import java.util.Scanner;
// The class is used to create a simple calculator that can perform addition, subtraction, multiplication, and division operations
class Expense {
    String category;
    double amount;
    // The constructor is used to initialize the category and amount of the expense
    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}
// Create a class called Calculator
public class ExpenseTracker {
    // The main method is the entry point of the program
    private static ArrayList<Expense> expenses = new ArrayList<>();
    // create a method to add expenses
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        // The while loop is used to continuously ask the user for input until they choose to exit
        while (running) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            // The nextInt method is used to get the user's choice
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            // The if-else statement is used to handle different user choices
            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc .nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc .nextDouble();
                    expenses.add(new Expense(category, amount));
                    System.out.println("Expense added successfully!");
                    break;
                case 2:
                    System.out.println("Expenses:");
                    for (Expense e : expenses) {
                        System.out.println(e.category + " - $" + e.amount);
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Expense Tracker.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}