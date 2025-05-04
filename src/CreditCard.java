public class CreditCard  implements Comparable<CreditCard>{
   private String name;
   private double apr;
   private  double balance;

   public CreditCard(String name, double apr, double balance) {
    this.name = name;
    this.apr = apr;
    this.balance = balance;
   }

   // @Override 
   // public String toString() {
   //    return name + "" + monthlyInterest();
   // }

   public String getName() {
    return name;
   }


   public double getApr() {
      return apr;
     }
   
   public double getBalance() {
    return balance;
   }
   public double monthlyInterest() {
      return balance * apr/12/100;
   }

   @Override
   public String toString() {
    return name +  "$" + String.format("%.2f", balance);
   }

   // public int CompareTo(CreditCard other) {
   //    if(monthlyInterest() > other.monthlyInterest()) {
   //       return 1;
   //    }
   //    if(monthlyInterest() < other.monthlyInterest()) {
   //          return -1;
   //    }
   //          return 0;
   // }

   @Override
   public int compareTo(CreditCard other) {
     double thisInterest = this.monthlyInterest();
     double otherInterest = other.monthlyInterest();
     return Double.compare(thisInterest, otherInterest);
}
}

   

   //   // System.out.println("Comparing" + name + "and" + other.name);
   //    if(balance > other.balance) {
   //       return 1;
   //    }
   //    if(balance < other.balance) {
   //       return -1; 
   //    }
   //       return 0;
   //    }

   // @Override
   // public int compareTo(CreditCard o) {
   //    // TODO Auto-generated method stub
   //    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
   // }
   // }