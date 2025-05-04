import static org.junit.Assert.assertEquals;

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

}

@Test
public void testRemain() {
    
}
}
