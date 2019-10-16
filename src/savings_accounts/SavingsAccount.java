package savings_accounts;

public class SavingsAccount {

    public static double annualInterestRate;
    public String saverName;
    private double savingsBalance;

    public SavingsAccount(String saverName, double initialBalance){
        this.saverName = saverName;
        setSavingsBalance(initialBalance);
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest(){
        if (savingsBalance > 0) {
            savingsBalance += (savingsBalance * annualInterestRate) / 12;
        }
        else{
            System.out.println("Cannot calculate interest for 0 or negative balance");
        }
    }


    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        if (savingsBalance < 0){
            System.err.println("Error! Cannot set negative balance. Balance will be set to 0");
        }
        else{
            this.savingsBalance = savingsBalance;
        }
    }

    public void showCurrentBalance(){
        System.out.println("Balance of " + this.saverName + ": USD " + String.format("%.2f", this.savingsBalance));
    }
}
