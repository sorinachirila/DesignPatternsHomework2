package behavioural.template.homework;

public class YahooEmailAccount extends EmailAccount {
    void setupUserAndPassword() {
        System.out.println("[YAHOO MAIL] Setting up user name and password...");
    }

    void registerAccount() {
        System.out.println("[YAHOO MAIL] Registering the account...");
    }

    void displayConfirmation() {
        System.out.println("[YAHOO MAIL] Account was created!");
    }
}
