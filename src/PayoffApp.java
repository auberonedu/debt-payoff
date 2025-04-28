
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PayoffApp {
    public static void main(String[] args) throws FileNotFoundException{

        //Map<String, Integer> schoolAges = new HashMap<>();

        // schoolAges.put("GRC", 40);
        // schoolAges.put("WSU", 100);
        // schoolAges.put("BC",35);
        // schoolAges.put("WSU", 135);

        //Print out age of WSU
        // System.out.println(schoolAges.get("WSU"));

        // for(var entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }


        // for(Map.Entry<String , Integer> entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // CreditCard amex = new CreditCard("American Ezp", 22, 1007);
        // CreditCard discover = new CreditCard("Discover It", 33, 500);

        // Map<String, CreditCard> cardMap = new HashMap<>();
        // cardMap.put("American Express", amex);
        // cardMap.put("Discover It", discover);

        // CreditCard myCard = cardMap.get("American Express");
        // System.out.println(cardMap.get("American Express"));

        // System.out.println(amex.monthlyInterest());

        String filename = args[0];

        Scanner scan = new Scanner(new File(filename));

        List<CreditCard> cards = new ArrayList();

        Map<String, CreditCard> cardMap = new HashMap<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard mycard = new CreditCard(name, apr, balance);

            cards.add(mycard);

            cardMap.put(name, mycard);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        
        // Collections.sort(cards, Collections.reverseOrder());
        // System.out.println(cards);

        // System.out.println(carMap);
       Scanner userSacnner = new Scanner(System.in);

       while (true) { 
           System.out.println("Enter name of card");
           String cardName = userSacnner.nextLine();

           CreditCard myCard = cardMap.get(cardName);

           System.out.println(myCard);
       }
    }
}
