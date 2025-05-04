import static org.junit.Assert.assertEquals;

import java.sql.BatchUpdateException;

import org.junit.Test;

public class BudgetTest {
    
@Test
public void testTotalLimit() {
Budget budget = new Budget();
budget.add(new BudgetCategory("Utilities", 500, 250));
budget.add(new BudgetCategory("Transportation", 200, 300));

assertEquals(700.0, budget.totalLimit(), 0.01);
    }

@Test
public void testTotalSpent() {
Budget budget = new Budget();
budget.add(new BudgetCategory("Groceries", 250, 100));
budget.add(new BudgetCategory("Internet", 300, 250));

assertEquals(500.0, budget.totalSpent(), 0.01);
}

@Test
public void testRemain() {
Budget budget = new Budget();
budget.add(new BudgetCategory("Stuff", 50, 100));
budget.add(new BudgetCategory("Memberships", 250, 300));

assertEquals(250.0, budget.remainder(), 0.01);
}
}
