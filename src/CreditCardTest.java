import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    public void testMonthlyInterestVisa() {
        CreditCard visa = new CreditCard("Visa", 14, 1400.0);
        double expectedIntr = 1400.0 * 14.0 / 12 / 100;
        assertEquals(expectedIntr, visa.monthlyInterest());
    }
    @Test
    public void testMonthlyInterestMasterCard() {
        CreditCard masterCard = new CreditCard("MasterCard", 10, 1000.0);
        double expectedIntr = 1000.0 * 10.0 / 12 / 100;
        assertEquals(expectedIntr, masterCard.monthlyInterest());
        }
    @Test
    public void testMonthlyInterestAmex() {
        CreditCard amex = new CreditCard("Amex", 24, 10000.0);
        double expectedIntr = 10000.0 * 24.0 / 12 / 100;
        assertEquals(expectedIntr, amex.monthlyInterest());
    }
    @Test
    public void checkGetters() {
        CreditCard unionPay = new CreditCard("UnionPay", 11, 800.0);
        assertEquals("UnionPay", unionPay.getName());
        assertEquals(11, unionPay.getApr());
        assertEquals(800.0, unionPay.getBalance());
    }
    @Test
    public void testNameAndBalance() {
        CreditCard discover = new CreditCard("Discover", 7.0, 700.0);
        assertEquals("Discover", discover.getName());
        assertEquals(700.0, discover.getBalance());
    }
    @Test
    public void testNameAndInterest() {
        CreditCard amex = new CreditCard("Amex", 28, 15000);
        assertEquals("Amex", amex.getName());
        assertEquals(28, amex.getApr());
    }
    @Test
    public void compareCardsWithDifferentMonthlyInterests() {
        CreditCard visa = new CreditCard("Visa", 14, 1000.0);
        CreditCard masterCard = new CreditCard("MasterCard", 13, 1000.0);
        assertTrue(visa.compareTo(masterCard) > 0);
    }
    @Test
    public void compareCardsWithEquivalentMonthlyInterests() {
        CreditCard visa = new CreditCard("Visa", 12, 1200.0);
        CreditCard masterCard = new CreditCard("MasterCard", 12, 1200.0);
        assertEquals(visa.compareTo(masterCard), 0);
    }
}
