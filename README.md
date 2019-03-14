# DesignPatternsHomework2
Implement the following Design Patterns
- <b>Behavioural</b>
    - <b>Iterator (aka Cursor)</b> 
        - Implement an Iterator over a TV channel list. In order to achieve this:
            - create a class ‘TVChannel’ with following members:
                - private int number
                - private String name;
                - generate constructor with arguments
                - override toString() to display channels in a friendly format
            - create an interface ‘Iterator’ similar with the one created at the class
            - create an interface ‘Container’ similar with the one created at the class
            - create a class ‘ChannelList’ that implements ‘Container’ that will contain following member and methods;
                - private LinkedList < TVChannel > channels;
                - constructor default (with no arguments) that will 
                    - allocate space for ‘channels’
                    - add few TVChannels to channel list like below:
                        - channels.add(new TVChannel(< number >, < name >));
                        - ….
                - private class ‘ChannelIterator’ that implements Iterator
                    - method implementation will be similar with what was done in the class
                - public Iterator getIterator()
            - create a class ‘ChannelIteratorDemo’ that will contain:
                - main method where you will iterate over the channel list and print out the channels
                - the output should be similar to this:
                - [1] - TVR 1
                - [2] - TVR 2
                - [3] - DIGISPORT 1
                - [4] - DIGISPORT 2
                - [5] - DIGISPORT 3
    - <b>Mediator</b>
        - Implement a ControlTower for an airport. In order to achieve this:
            - create an abstract class ‘FlyingObject’ with the following
                - protected String type; // it should be accessible from derived classes
                - getter for type
                - public abstract void sendMessage(String message)
            - create class ‘Helicopter’ that extends FlyingObject
            - create class ‘Plane’ that extends FlyingObject
            - create class ‘UFO’ that extends FlyingObject
                - all classes will have a constructor where type is set
            - create a class ‘ControlTower’ similar with the example done at the class (this will be the Mediator)
            - create a class ‘ControlTowerDemo’ that will contain a main function. Here you will:
                - instantiate three different objects: plane, helicopter and UFO
                - each of them will send different messages 
                - the output should be similar to this:
                - [Sat Mar 09 13:14:06 CET 2019][PLANE]: Taking off..
                - [Sat Mar 09 13:14:06 CET 2019][HELICOPTER]: Entering surveillance mode...
                - [Sat Mar 09 13:14:06 CET 2019][UFO]: Initiating contact...
    - <b>Strategy (aka Policy)</b>
        - Implement an Attack Strategy for a strategy game. In order to achieve this:
            - create an interface class ‘AttackStrategy’ with the following method
                - public void execute()
            - create a class ‘ArrowAttack’ that implements ‘AttackStrategy’
            - create a class ‘SpellAttack’ that implements ‘AttackStrategy’
            - create a class ‘SwordAttack’ that implements ‘AttackStrategy’
                - each ‘execute()’ method will display messages similar with this one:
                    - “[ARROW ATACK] - 10 points damage”
            - create a class ‘AttackMission’ (the context) with the following members:
                - private AttackStrategy strategy;
                - constructor where you initialize strategy
                - public vid executeStrategy()
            - create a class ‘AttackStrategyDemo’ that will contain a main function. Here you will: 
                - instantiate a new AttackMission(new ArrowAttack())
                - execute strategy
                - make a new attack mission with a Sword attack strategy
                - execute strategy
                - make a new attack mission with a Spell attack strategy
                - execute strategy
                - the output will be similar to this:
                - [ARROW ATTACK] - 10 points damage
                - [SWORD ATTACK] - 5 points damage
                - [SPELL ATTACK] - 15 points damage
    - <b>Template Method</b>
        - Implement a template method for creating new email accounts. In order to achieve this:
            - create abstract class ‘EmailAccount’ with the following methods:
                - abstract void setupUserAndPassword();
                - abstract void registerAccount();
                - abstract void displayConfirmation();
                - public final void createAccount(); 
                    - it is final to not be overridden in derived classes.
                    - it will contain the steps needed for creating a new email account:
                        - setupUserAndPassword()
                        - registeAccount()
                        - displayConfirmation
            - create class ‘GoogleEmailAccount’ that extends ‘EmailAccount’
            - create class ‘YahooEmailAccount’ that extends ‘EmailAccount’
                - implement the abstract methods by displaying a message
            - create class ‘EmailAccountDemo’ that will contain a main method. Here you will:
                - instantiate a new ‘YahooEmailAccount’
                    - will createAccount() for the new instantiated account
                - instantiate a new ‘GoogleEmailAccount’
                    - will createAccount() for the new instantiated account
                - the output will be similar to this:
                - [YAHOO MAIL] Setting up user name and password...
                - [YAHOO MAIL] Registering the account...
                - [YAHOO MAIL] Account was created!
                - [GOOGLE MAIL] Setting up user name and password...
                - [GOOGLE MAIL] Registering the account...
                - [GOOGLE MAIL] Account was created!