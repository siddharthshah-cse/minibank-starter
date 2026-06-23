public class Account {
    private final String accountNumber;
    private String ownerName;
    private long balance;            // whole rupees
    private boolean active;
    private static int counter = 1;

    public Account(String ownerName, long openingBalance) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
    }
    public Account(String ownerName) { this(ownerName, 0); }   // constructor chaining
    private static String generateAccountNumber() { return String.format("AC%04d", counter++); }

    public void deposit(long amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(long amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;                                          // insufficient funds
    }
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName()     { return ownerName; }
    public long getBalance()         { return balance; }
    public boolean isActive()        { return active; }
}