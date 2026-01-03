
public class YourFirstAccount {

    public static void main(String[] args) {
        Account emerysAccount = new Account("Emery's Account", 100.00);
        
        emerysAccount.deposit(20.00);
        System.out.println(emerysAccount);
        
    }
}
