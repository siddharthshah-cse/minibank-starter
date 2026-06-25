public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("Riya", 5000);
        accounts[1] = new Account("Aman", 1000);
        accounts[2] = new Account("Neha");          // 0 opening balance

        accounts[0].deposit(2000);                   // -> 7000
        boolean ok1 = accounts[0].withdraw(3000);    // -> 4000, true
        boolean ok2 = accounts[0].withdraw(10000);   // unchanged, false

        for (Account a : accounts) {
            System.out.println(a.getAccountNumber() + " | " + a.getOwnerName() + " | " + a.getBalance());
        }
        System.out.println("withdraw 3000 -> " + ok1);
        System.out.println("withdraw 10000 -> " + ok2);
    }
}