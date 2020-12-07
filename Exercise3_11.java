/*(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
        that withdraws money from an Account . Ensure that the withdrawal amount does not exceed
        the Account ’s balance. If it does, the balance should be left unchanged and the method should print
        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
        (Fig. 3.9) to test method withdraw .*/


//*public class Exercise3_11 {
    // Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.
//    public class Account

public class Exercise3_11 {
        private String name;
        private double balance;
    public Exercise3_11(String name, double balance) {      //public Account(String name, double balance) {
            this.name = name;
            if (balance > 0.0)
                this.balance = balance;
    }
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    //MODIFICATION
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0.0 && balance>withdrawAmount) {
            balance = balance - withdrawAmount;
        }else{
            System.out.println("Withdrawal amount exceeded account balance.");
            this.balance=balance;
        }
    }
    // method returns the account balance
    public double getBalance() {
        return balance;
    }


        public void setName(String name)
        {
            this.name = name;
        }
        public String getName(){
            return name;
    }
}