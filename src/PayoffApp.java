import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class PayoffApp {
    public static void main(String[] args) {
        CreditCard amex = new CreditCard("American Express Platinum", 25, 1300);
        System.out.println(amex.getApr());

        CreditCard amexBasic = new CreditCard("American Express Basic", 33, 200);
        System.out.println(amexBasic.getApr());

        CreditCard chase = new CreditCard("Chase Sapphire", 21, 321);
        System.out.println(chase.getApr());
        System.out.println(chase);

        System.out.println(amex.getBalance());
        Scanner scan = new Scanner(System.in);

        List<CreditCard> cards = new ArrayList<CreditCard>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard myCard = new CreditCard(name, apr, balance);
            
            cards.add(myCard);

            System.out.println(myCard);


            //String aprString = String.format("%.2f%%", apr);
            //String balanceString = String.format("$%.2f", balance);
            //System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
       // }
        //System.out.println(cards);

       // Collections.sort(cards);
        //System.out.println(cards);

       // Collections.sort(cards, Collections.reverseOrder());
        //System.out.println(cards);

        }
    }
}
