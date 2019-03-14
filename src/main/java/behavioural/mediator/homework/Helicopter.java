package behavioural.mediator.homework;

public class Helicopter extends FlyingObject {

    //constructor to initialize type
    public Helicopter(String type) {
        this.type = type;
    }

    public void sendMessage(String message) {
        ControlTower.showMessage(this, message);
    }
}
