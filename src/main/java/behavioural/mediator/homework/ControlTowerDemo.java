package behavioural.mediator.homework;

public class ControlTowerDemo {
    public static void main(String[] args) {
        FlyingObject plane = new Plane("plane");
        FlyingObject helicopter = new Helicopter("helicopter");
        FlyingObject UFO = new UFO("ufo");

        //send different messages
        plane.sendMessage("Taking off..");
        helicopter.sendMessage("Entering surveillance mode...");
        UFO.sendMessage("Initiating contact...");

//output
//[Thu Mar 14 12:41:04 EET 2019][PLANE]: Taking off..
//[Thu Mar 14 12:41:04 EET 2019][HELICOPTER]: Entering surveillance mode...
//[Thu Mar 14 12:41:04 EET 2019][UFO]: Initiating contact...

    }
}
