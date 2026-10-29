
public class TestAccount {
    public static void main(String[] args) {

        
        Account account = new Account(1001, 20000);

        Account.setAnnualInterestRate(0.5);

        System.out.println("INITIAL ACCOUNT");
        System.out.println(account);

        
        account.withdraw(2500);
        System.out.println("\nAFTER WITHDRAWAL");
        System.out.println(account);

       
        account.deposit(3000);
        System.out.println("\nAFTER DEPOSIT");
        System.out.println(account);
    }
}
