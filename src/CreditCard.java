

public class CreditCard implements Comparable<CreditCard> {
    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name,double apr,double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public double gitApr(){
        return apr;
    }

    public String getName() {
        return name;
    }

    public double getApr() {
        return apr;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return name + " " + balance;
    }
    public double monthlyIntrest(){
        return balance *apr/12/100;
    }
    public int compareTo(CreditCard other){
    

        if(monthlyIntrest() > other.monthlyIntrest()){
            return  1;
        }
        if(monthlyIntrest() < other.monthlyIntrest()){
            return -1;
        }
        return 0;
        
    }
    
}