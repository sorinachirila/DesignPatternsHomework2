package behavioural.iterator.homework;

import java.util.LinkedList;
import java.util.List;

public class ChannelList implements Container {
    //define necessary fields
    private List<TVChannel> channels;


    //default constructor
    public ChannelList() {
        channels = new LinkedList<TVChannel>();
        channels.add(new TVChannel(1, "TVR 1"));
        channels.add(new TVChannel(2, "TVR 2"));
        channels.add(new TVChannel(3, "TVR 3"));
        channels.add(new TVChannel(4, "Da Vinci Kids"));
        channels.add(new TVChannel(5, "AXN"));
        channels.add(new TVChannel(6, "Eurosport 1"));
        channels.add(new TVChannel(7, "DIGISPORT 1"));
        channels.add(new TVChannel(8, "DIGISPORT 2"));
        channels.add(new TVChannel(9, "DIGISPORT 3"));
    }

    private class ChannelIterator implements Iterator {
        //define necessary fields
        private int index;

        public boolean hasNext() {
            if (index < channels.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return channels.get(index++);
            }
            return null;
        }
    }

    public Iterator getIterator() {
        return new ChannelIterator();
    }
}
