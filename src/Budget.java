import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Map<String, BudgetCategory> categories;
    
    public Budget() {
        categories = new HashMap<>();
    }
    
    public void add(BudgetCategory category) {
        categories.put(category.getName(), category);
    }

    public BudgetCategory get(String name) {
       if(categories.containsKey(name)) {
        return categories.get(name);
       }
       else {
        return null;
       }
    }

    public double totalLimit() {
        double total = 0.0;
        for (BudgetCategory category : categories.values()) {
            total += category.getLimit();
        }
        return total;
    }

    public double totalSpent() {
        double total = 0.0;
        for (BudgetCategory category : categories.values()) {
            total += category.getSpent();
        }
        return total;
    }
    
    public double remainder() {
        return totalLimit() - totalSpent();
    }
}


