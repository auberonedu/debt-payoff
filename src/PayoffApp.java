import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PayoffApp {
    public static void main(String[] args) throws FileNotFoundException {
        //String filename = args[0];
        Scanner scan = new Scanner(new File("userInput.txt"));

         Map<String, CreditCard> cardMap = new HashMap<>();
         Budget budget = new Budget();
         //total budget
         double totalBudget = 1000.00;


        // CreditCard amex = new CreditCard("American Expresss", 22, 1007);
        // CreditCard discover = new CreditCard("Discover It", 33, 500);

        // Map<String, CreditCard> cardMap = new HashMap<>();
    //     cardMap.put("American Express", amex);
    //     cardMap.put("Discover It", discover);

    //     System.out.println(cardMap.get("American Express"));

    //     CreditCard myCard = cardMap.get("American Express");
    //     System.out.println(myCard.getApr());
    //    System.out.println(amex.monthlyInterest());

        // String filename = args[0];
        // Scanner scan = new Scanner(new File(filename));

    //    List<CreditCard> cards = new ArrayList<CreditCard>();
    //    Map<String, CreditCard> cardMap = new HashMap<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();
            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard myCard = new CreditCard(name, apr, balance);
            cardMap.put(name, myCard);
        
            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        
        }

        // System.out.println(cards);
        // Collections.sort(cards, Collections.reverseOrder());
        // System.out.println(cards);
        // System.out.println(cardMap);

        Scanner userScanner = new Scanner(System.in);
        while(true) {
             System.out.println("Enter the name of the card, 'summary', quit"); 
        String input = userScanner.nextLine();
        

        if(input.equalsIgnoreCase("Quit")) {
            System.out.println("End");
            break;
        }

        //adding option summary
        else if(input.equalsIgnoreCase("summary")) {
            double totalLimit = budget.totalLimit();
            double totalSpent = budget.totalSpent();
            double difference = budget.remainder();
        
        System.out.printf("Total Budget: $%.2f\n", totalLimit);
        System.out.printf("Total Spent: $%.2f\n", totalSpent);

        if (difference > 0) {
            System.out.printf("You are under budget by $%.2f\n", difference);
        } else if (difference < 0) {
            System.out.printf("You are over budget by $%.2f\n", Math.abs(difference));
        } else {
            System.out.println("You are exactly on budget.");
        }
    }
    else {
      CreditCard card = cardMap.get(input);
      BudgetCategory category = budget.get(input);

   if (card != null) {
        System.out.println("Card Name: " + card.getName());
        System.out.printf("Apr: %2.f%%\n", + card.getApr());
        System.out.printf("Balance: $%.2f\n", + card.getBalance());
      }
      else if (category != null) {
        System.out.println("Card Name: " + card.getName());
        System.out.printf("Apr: %2.f%%\n", + card.getApr());
        System.out.printf("Balance: $%.2f\n", + card.getBalance());
      }
      else {
        System.out.println("Error");
      }
      }
    }
    scan.close();
    userScanner.close();
}
}

    
        // CreditCard myCard = cardMap.get(cardName);
        // System.out.println(myCard);


