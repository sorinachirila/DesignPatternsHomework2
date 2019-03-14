package behavioural.strategy.homework;

public class AttackMission {
    //This is the CONTEXT...
    //define necessary fields
    private AttackStrategy strategy;

    //constructor
    public AttackMission(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
