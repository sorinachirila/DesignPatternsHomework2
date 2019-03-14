package behavioural.mediator.homework;

public class Plane extends FlyingObject {

    //constructor to initialize type
    public Plane(String type) {
        this.type = type;
    }

    public void sendMessage(String message) {
        ControlTower.showMessage(this, message);
    }
}
