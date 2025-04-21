public class CreditCard {
    private String name;
    private double balance;
    private double apr;

    public CreditCard(String name, double balance, double apr){
        this.name = name;
        this.balance = balance;
        this.apr = apr;
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

    public String toString(){
        return name + ": " + balance;
    }
}