class BankAccount {

    private int accountNumber;
    private double balance;

    static int accountCount = 0;

    final int accountId;

    // Constructor
    BankAccount(int accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;

        accountCount++;
        accountId = accountCount;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }
}

// Separate testing class
class BankTest {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, 5000);
        BankAccount b2 = new BankAccount(102, 3000);

        b1.deposit(2000);
        b1.withdraw(1000);

        System.out.println("Account ID: " + b1.accountId);
        System.out.println("Current Balance: " + b1.getBalance());

        System.out.println("Total Accounts: " +
                BankAccount.accountCount);

        // System.out.println(b1.balance);
    }
}