public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;

    // Constructor
    public CreditCard(String name, double apr, double balance){
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public double getApr(){
        return apr;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return name + " balance: " + balance + ", interest: " + monthlyInterest();

    }

    public double monthlyInterest(){
        return balance * apr / 12 / 100;
    }

    public int compareTo(CreditCard other){
        // We can see the "behind the scense" by seeing what compares to
        // System.out.println("Comparing " + name + " and " + other.name);

        
        if (monthlyInterest() > other.monthlyInterest()){
            return 1;
        }
        if (monthlyInterest() < other.monthlyInterest()){
            return -1;
        }
            return 0;
        }

        // if (balance > other.balance){
        //     return 1;
        // }
        // if (balance < other.balance){
        //     return -1;
        // }
        //     return 0;
        // }
        
    }





    

