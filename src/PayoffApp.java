import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PayoffApp {
    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();

        // CreditCard amex = new CreditCard("American Express", 22, 1007);
        // CreditCard discover = new CreditCard("Discover It", 33, 500);

        Map<String, CreditCard> cardMap = new HashMap<>();
        // cardMap.put("American Express", amex);
        // cardMap.put("Discover It", discover);

        // CreditCard myCard = cardMap.get("American Express");
        // System.out.println(myCard.getApr());
        
        // CreditCard amex = new CreditCard("American Express", 1007,22);
        // System.out.println(amex.getApr());

        // CreditCard discover = new CreditCard("Discover It", 500, 33);

        // System.out.println(discover.compareTo(amex));

        // System.out.println(amex.monthlyInterest());

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
            cardMap.put(name, myCard);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        // System.out.println(cards);
        // System.out.println();
        // Collections.sort(cards, Collections.reverseOrder());
        // System.out.println();
        // System.out.println(cards);
        System.out.println(cardMap);
    }
}

