public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a bankAccount class object
        BankAccount account = new BankAccount("313154", "Harman", 6000);

        // Display account details
        account.displayAccountDetails();

        // Perform transactions on balance
        account.depositBalance(1500);
        account.withdrawBalance(400);
        System.out.println();

        // Display updated account details
        System.out.println("After Cash Out:");
        account.displayAccountDetails();

        // Create a Savings account class object
        SavingsAccount account1 = new SavingsAccount("6534522", "Harman", 20000, 15);

        // Display Savings account details
        account1.displaySavingsAccountDetails();
    }
}
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Public method to access balance
    public double getBalance() {
        return balance;
    }
    // Public method to deposit balance
    public void depositBalance(double amount) {
        if(amount>=0) {
            balance+=amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.print("Invalid Amount. Please Check again");
        }
    }

    // Public method to withdraw balance
    public void withdrawBalance(double amount) {
        if(amount>=0 && amount<=balance) {
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.print("Invalid Amount. Please Check again");
        }
    }
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

//Child class
class SavingsAccount extends BankAccount {
    // Variable
    private final double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate / 100; // Access private variable using getter method
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Holder: " + accountHolder); // Protected variable (Accessible in subclass)
        System.out.println("Balance: " + getBalance()); // Access private variable using getter method
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + calculateInterest());
        System.out.println();
    }
}

//output
//Account Number: 313154
//Account Holder: Harman
//Balance: 6000.0
//
//Deposited: 1500.0
//Withdrawn: 400.0
//
//After Cash Out:
//Account Number: 313154
//Account Holder: Harman
//Balance: 7100.0
//
//Savings Account Details:
//Account Number: 6534522
//Account Holder: Harman
//Balance: 20000.0
//Interest Rate: 15.0
//Interest: 3000.0



