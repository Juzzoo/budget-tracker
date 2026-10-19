
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {

        // Original code commented out for Wave 1
        /*
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);

            System.out.println("The budget limit for " + category + " was: " + limitString +
                               " but the actual spend was " + spentString);
        }
        */

        // Wave 1: Test BudgetCategory
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        System.out.println(groceries.getName());
        System.out.println(groceries.getBudget());
        System.out.println(groceries.getSpent());
        System.out.println(groceries);
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     *
     * This should be the sum of how much over/under budget each individual category is.
     *
     * If the person is under budget, the result will be negative.
     * If they are over budget, the result will be positive.
     *
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: Implement in Wave 4
        return -1;
    }
}
