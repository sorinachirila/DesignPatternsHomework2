package behavioural.mediator.homework;

import java.util.Date;

public class ControlTower {
    //This is the MEDIATOR...
    public static void showMessage(FlyingObject flyingObject, String message) {
        System.out.println("[" + new Date().toString() + "][" + flyingObject.getType().toUpperCase() + "]: " + message);
    }
}
