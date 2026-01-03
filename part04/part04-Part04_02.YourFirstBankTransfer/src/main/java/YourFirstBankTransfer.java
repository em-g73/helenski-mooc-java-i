
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.00);
        
        matthewsAccount.withdrawal(100.00);
        System.out.println(matthewsAccount);
        myAccount.deposit(100.00);
        System.out.println(myAccount);
    }
}
