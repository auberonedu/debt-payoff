import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        CreditCard amex = new CreditCard("American Express",22,1007);
        CreditCard discover = new CreditCard("Discover",33,500);
        System.out.println(amex.monthlyIntrest());
        Scanner scan = new Scanner(System.in);

        List<CreditCard> cards = new ArrayList<>();
        

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
        
            if(scan.hasNextLine()) scan.nextLine();

           

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
        System.out.println(cards);
        Collections.sort(cards, Collections.reverseOrder());
        System.out.println(cards);
     }
}
