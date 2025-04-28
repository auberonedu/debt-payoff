import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoffApp {
    public static void main(String[] args) {
        // Map<String, Integer> schoolAges = new HashMap<>();
        // schoolAges.put("GRC", 40);
        // schoolAges.put("WSU", 100);
        // schoolAges.put("BC", 35);
        // schoolAges.put("WSU", 135);

        // print out age of wsu.
        //System.out.println(schoolAges.get("WSU"));

        // for (var entry : schoolAges.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // for (Map.Entry<String, Integer> entry : schoolAges.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // CreditCard amex = new CreditCard("American Express", 22, 1007);
        // CreditCard discover = new CreditCard("Discover it", 33, 500);

        // Map<String, CreditCard> cardMap = new HashMap<>();
        // cardMap.put("American Express", amex);
        // cardMap.put("Discover it", discover);

        // CreditCard myCard = cardMap.get("American Express");
        // System.out.println(myCard.getBalance());


        //  //System.out.println(amex.monthlyInterest());

         Scanner scan = new Scanner(System.in);

         List<CreditCard> cards = new ArrayList<>();
         Map<String, CreditCard> cardMap = new HashMap<>();

         while(scan.hasNextLine()) {
            String name = scan.nextLine();
            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard myCard = new CreditCard(name, apr, balance);

            cards.add(myCard);
            cardMap.put(name, myCard);

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
         }

        //  System.out.println(cards);
        //  Collections.sort(cards, Collections.reverseOrder());
        //  System.out.println(cards);
            System.out.println(cardMap);
     }
 }
