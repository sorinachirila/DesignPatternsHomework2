package behavioural.iterator.homework;

public class ChannelIteratorDemo {
    public static void main(String[] args) {
        ChannelList channelList = new ChannelList();
        Iterator it = channelList.getIterator();
        while (it.hasNext()) {
            TVChannel tvChannel = (TVChannel) it.next();
            System.out.println(tvChannel);
        }
    }
}
//output
//[1] - TVR 1
//[2] - TVR 2
//[3] - TVR 3
//[4] - Da Vinci Kids
//[5] - AXN
//[6] - Eurosport 1
//[7] - DIGISPORT 1
//[8] - DIGISPORT 2
//[9] - DIGISPORT 3
