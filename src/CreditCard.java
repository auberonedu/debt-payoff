public class CreditCard implements Comparable<CreditCard>{
    private String name;
    private double balance;
    private double apr;

    public CreditCard(String name, double apr, double balance){
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

    public int compareTo(CreditCard other){
        //System.out.println("Comparing " + name + " and " + other.name);

        if (monthlyInterest() > other.monthlyInterest()){
            return 1;
        } else if (monthlyInterest() < other.monthlyInterest()){
            return -1;
        }

        return 0;
    }

    public double monthlyInterest(){
        return balance * apr / 12 / 100;
    }

    @Override
    public String toString(){
        return name + " " + monthlyInterest();
    }
}