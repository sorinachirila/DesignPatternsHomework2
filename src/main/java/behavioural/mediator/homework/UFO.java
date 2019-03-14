package behavioural.mediator.homework;

public class UFO extends FlyingObject {

    //constructor to initialize type
    public UFO(String type) {
        this.type = type;
    }

    public void sendMessage(String message) {
        ControlTower.showMessage(this, message);
    }
}
