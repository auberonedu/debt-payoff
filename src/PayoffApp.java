import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    // public static void main(String[] args) {
    //     CreditCard amexPlat = new CreditCard("American Express Platinum", 25, 1300);
    //     // System.out.println(amexPlat.getApr());

    //     CreditCard amexBasic = new CreditCard("American Express Basic", 25, 1300);
    //     // System.out.println(amexBasic.getApr());

    //     CreditCard chase = new CreditCard("Chase Sapphire", 21, 321);
    //     // System.out.println(chase.getApr());
    //     System.out.println(chase);
    //     // System.out.println(amexPlat.getBalance());
    // }
    
    public static void main(String[] args) {
        CreditCard amex = new CreditCard("American Express", 22, 1007);
        CreditCard discover = new CreditCard("Discover It", 33, 500);

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

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
        System.out.println();
        System.out.println(cards);
        Collections.sort(cards, Collections.reverseOrder());
        System.out.println(cards);

    }
}
