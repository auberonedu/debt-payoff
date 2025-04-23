public class CreditCard implements Comparable<CreditCard>{
    
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
    return name + " "  + monthlyInterst();
  }

  public double monthlyInterst(){
    return balance * Apr /12 /100;
  }

public int compareTo(CreditCard other){
   
  if(monthlyInterst()> other.monthlyInterst()){
    return 1;
  }
  if(monthlyInterst() < other.monthlyInterst()){
    return -1;
  }
    return 0;
  
}

}