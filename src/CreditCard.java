public class CreditCard {
    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name, double apr, double balance){
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }
    
    public double getApr(){
        return apr;
    }

    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " " + balance;
    }
}