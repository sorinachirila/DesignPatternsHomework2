package behavioural.strategy.homework;

public class AttackStrategyDemo {
    public static void main(String[] args) {
        //Arrow
        AttackMission attackMission = new AttackMission(new ArrowAttack());
        attackMission.executeStrategy();
        //Sword
        attackMission = new AttackMission(new SwordAttack());
        attackMission.executeStrategy();
        //Spell
        attackMission = new AttackMission(new SpellAttack());
        attackMission.executeStrategy();
    }
}
//output
//[ARROW ATTACK] - 10 points damage
//[SWORD ATTACK] - 5 points damage
//[SPELL ATTACK] - 15 points damage