
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            if (scan.hasNextLine()) {
                scan.nextLine();
            }

            BudgetCategory budgetCategory =
                    new BudgetCategory(category, limit, spent);

            categories.add(budgetCategory);
        }

        System.out.println(categories);
    }

    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: Implement in Wave 4
        return -1;
    }
}
