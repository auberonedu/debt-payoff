import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<CreditCard> cards = new ArrayList<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard myCard = new CreditCard(name, apr, balance);

            cards.add(myCard);

            /** String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString); **/
        }

        System.out.println(cards);
        //Collections.sort(cards, Collections.reverseOrder());
        //System.out.println(cards);
    }
}
