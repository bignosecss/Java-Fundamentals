import java.util.Scanner;

public class CalculateFees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Monthly salary: ");
        double salary = scanner.nextDouble();
        Earn earns = new Earn(salary);

        System.out.print("Monthly eat/wear/live/transportation Fees: ");
        double eatFees = scanner.nextDouble();
        double wearFees = scanner.nextDouble();
        double liveFees = scanner.nextDouble();
        double transportationFees = scanner.nextDouble();
        Expense expenses = new Expense(eatFees, wearFees, liveFees, transportationFees);

        double moneyLeft = earns.salary - Expense.calcTotalMonthly(expenses);

        System.out.println("Left " + moneyLeft + " per month.");

        scanner.close();
    }
}
