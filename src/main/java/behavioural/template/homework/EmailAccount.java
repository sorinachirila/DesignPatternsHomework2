package behavioural.template.homework;

public abstract class EmailAccount {
    //abstract methods
    abstract void setupUserAndPassword();

    abstract void registerAccount();

    abstract void displayConfirmation();

    public final void createAccount() {//it is final to not be overridden in derived classes.
        //it will contain the steps needed for creating a new email account
        setupUserAndPassword();
        registerAccount();
        displayConfirmation();
    }

}
