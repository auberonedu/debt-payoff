public class CreditCard {
    
  private String name;
  private double Apr;
  private double balance;

  public CreditCard(String name , double Apr, double balance ){
    this.name = name;
    this.Apr = Apr;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public double getApr(){
    return Apr; 
  }

  @Override
  public String toString(){
    return name + " "  + balance;
  }

}