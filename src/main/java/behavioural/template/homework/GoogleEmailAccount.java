package behavioural.template.homework;

public class GoogleEmailAccount extends EmailAccount {
    void setupUserAndPassword() {
        System.out.println("[GOOGLE MAIL] Setting up user name and password...");
    }

    void registerAccount() {
        System.out.println("[GOOGLE MAIL] Registering the account...");
    }

    void displayConfirmation() {
        System.out.println("[GOOGLE MAIL] Account was created!");
    }
}
