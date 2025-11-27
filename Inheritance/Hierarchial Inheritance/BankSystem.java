
public class BankSystem {
    public static void main(String[] args) {
        // Savings Account
        SavingsAccount savings = new SavingsAccount("SA123", 5000.00, 3.5);
        savings.displayAccountType();
        savings.displayAccountInfo();

        System.out.println();

        // Checking Account
        CheckingAccount checking = new CheckingAccount("CA456", 3000.00, 1000.00);
        checking.displayAccountType();
        checking.displayAccountInfo();

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 10000.00, 12);
        fd.displayAccountType();
        fd.displayAccountInfo();
    }
}
