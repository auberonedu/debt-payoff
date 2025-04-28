import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {

        /* 
        - Maps will overwrite the value when put in the same key name.
        - Maps is the one way when it comes to searching with .get(); We can only search with a key name to find the value, not the other way arround.
        */
        // Map<String, Integer> schoolAges = new HashMap<>();
        // schoolAges.put("GRC", 40);
        // schoolAges.put("WSU", 100);
        // schoolAges.put("BC", 35);
        // schoolAges.put("WSU", 135);

        // Print out the age of WSU
        // System.out.println(schoolAges.get("WSU"));

        // Print using key 
        // for (String college : schoolAges.keySet()){
        //     System.out.println(college);
        // }

        // // Print using values
        // for (Integer college : schoolAges.values()){
        //     System.out.println(college);
        // }

        // for (Map.Entry<String, Integer> entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // // We can use var to let java to figure out itself of which type of variable we're using
        // for (var entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        
        // CreditCard amex = new CreditCard("American Express", 22, 1007);
        // CreditCard discover = new CreditCard("DIscover It", 33, 500);

        // Map<String, CreditCard> cardMap = new HashMap<>();
        // cardMap.put("American Express", amex);
        // cardMap.put("Discover It", discover);

        // System.out.println(cardMap.get("American Express"));

        // CreditCard myCard = cardMap.get("American Express");
        // System.out.println(myCard.getApr());
        
        // // System.out.println(amex.monthlyInterest());

        Scanner scan = new Scanner(System.in);

        // Create an arrayList
        List<CreditCard> cards = new ArrayList<>();
        Map<String, CreditCard> cardMap = new HashMap<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard myCard = new CreditCard(name, apr, balance);
            
            // Add the balance to the balances list
            cards.add(myCard);
            cardMap.put(name, myCard);
           

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        // Print out the balances list and sort it
        // System.out.println(cards);
        // Collections.sort(cards, Collections.reverseOrder());
        // System.out.println(cards);
        System.out.println(cardMap);
    }
}
