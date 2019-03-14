package behavioural.iterator.homework;

public class TVChannel {
    //declare necessary fields
    private int number;
    private String name;


    //constructor with parameters
    public TVChannel(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + number + "] - " + name;
    }
}
