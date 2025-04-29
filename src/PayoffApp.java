import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;


public class PayoffApp {
    public static void main(String[] args) throws FileNotFoundException {
        
        // String filename = args[0];
        // Scanner scan = new Scanner(new File(filename));
        
        // Map<String, Integer> schoolAges = new HashMap<>();
        // schoolAges.put("GRC", 40);
        // schoolAges.put("WSU", 100);
        // schoolAges.put("BC", 35);

        // //print out age of WSU
        // //System.out.println(schoolAges.get("WSU"));
        // for (String college : schoolAges.keySet()) {
        //     System.out.println(college);
        // }

        // for (int age : schoolAges.values()) {
        //     System.out.println(age);
        // }

        // for (Map.Entry<String, Integer> entry : schoolAges.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        // //when using var, java infers the data type
        // for (var entry : schoolAges.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        

        CreditCard amex = new CreditCard("American Express", 22, 1007);
        CreditCard discover = new CreditCard("Discover It", 33, 500);

        //System.out.println(amex.getApr());
        //System.out.println(amexBasic.getApr());

        // Map<String, CreditCard> cardMap = new HashMap<>();
        // cardMap.put("American Express", amex);
        // cardMap.put("Discover It", discover);
        
        //create variable from a hashmap and retrieve specific data
        //CreditCard myCard = cardMap.get("American Express");
        //System.out.println(myCard.getApr());


        //CreditCard amexBasic = new CreditCard("American Express Basic", 33, 200);
        
        //System.out.println(amex.compareTo(discover));
        //System.out.println(discover.compareTo(amex));
        //System.out.println(amex.monthlyInterest());
        //System.out.println(discover.monthlyInterest());

        //CreditCard chase = new CreditCard("Chase Sapphire", 21, 321);
        //System.out.println(chase.getApr());
        //System.out.println(chase);

        //System.out.println(amex.getBalance());
        
        Scanner scan = new Scanner(System.in);

        List<CreditCard> cards = new ArrayList<CreditCard>();
        
        Map<String, CreditCard> cardMap = new HashMap<>();
        
            while(scan.hasNextLine()) {
                String name = scan.nextLine();

                double apr = scan.nextDouble();
                double balance = scan.nextDouble();

             
                if(scan.hasNextLine()) scan.nextLine();

                CreditCard myCard = new CreditCard(name, apr, balance);

                cards.add(myCard);
                cardMap.put(name, myCard);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
        
        System.out.println(cardMap);

        // System.out.println(cards);
        // Collections.sort(cards);
        
        // System.out.println(cards);
        // Collections.sort(cards, Collections.reverseOrder());
        // System.out.println(cards);
        // Collections.sort(cards);
        // System.out.println(cards);
    

    // //Scan for user input
    //    Scanner userScanner = new Scanner(System.in);

    //    while (true) {
    //     System.out.println("Enter the name of the card: ");
    //     String cardName = userScanner.nextLine();

    //     CreditCard myCard = cardMap.get(cardName);
    //     if (myCard == null) {
    //         System.out.println("No such card");
    //     } else {
    //     System.out.println(myCard);
    //         }
    //     }
    }
}

