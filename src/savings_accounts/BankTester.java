package savings_accounts;

public class BankTester {

    public static void testCalculations(SavingsAccount account1, SavingsAccount account2, double interestRate){
        System.out.println("Calculate interest with rate: " + String.format("%.2f%%%n", interestRate*100));
        System.out.println("Balances before interest calculation.");
        account1.showCurrentBalance();
        account2.showCurrentBalance();
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println();
        System.out.println("Balances after interest calculation.");
        account1.showCurrentBalance();
        account2.showCurrentBalance();
    }


    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount("Saver #1",2000);
        SavingsAccount saver2 = new SavingsAccount("Saver #2",3000);

        SavingsAccount.modifyInterestRate(0.04);
        testCalculations(saver1, saver2, SavingsAccount.annualInterestRate);

        System.out.println("---------------------------------------");

        SavingsAccount.modifyInterestRate(0.05);
        testCalculations(saver1, saver2, SavingsAccount.annualInterestRate);
    }
}
