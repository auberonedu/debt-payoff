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

}
