package behavioural.mediator.homework;

public abstract class FlyingObject {
    //define necessary fields
    protected String type;

    //getter
    public String getType() {
        return type;
    }

    public abstract void sendMessage(String message);
}
