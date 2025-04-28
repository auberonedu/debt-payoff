import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class PayoffApp {
    public static void main(String[] args) throws FileNotFoundException {

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

        String filename = args[0];

        Scanner scan = new Scanner(new File(filename));

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
        // System.out.println(cardMap);

        Scanner userScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the name of the card: ");
            String cardName = userScanner.nextLine();

            CreditCard myCard = cardMap.get(cardName);

            if (myCard == null){
                System.out.println("No such card!");
            } else {
                System.out.println(myCard);
            }
        }
    }
}

