package behavioural.template.homework;

public class EmailAccountDemo {
    public static void main(String[] args) {
        EmailAccount yahooEmailAccount = new YahooEmailAccount();
        yahooEmailAccount.createAccount();
        EmailAccount googleEmailAccount = new GoogleEmailAccount();
        googleEmailAccount.createAccount();
    }
}
//output
//[YAHOO MAIL] Setting up user name and password...
//[YAHOO MAIL] Registering the account...
//[YAHOO MAIL] Account was created!
//[GOOGLE MAIL] Setting up user name and password...
//[GOOGLE MAIL] Registering the account...
//[GOOGLE MAIL] Account was created!