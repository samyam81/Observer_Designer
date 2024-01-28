package ObserverDesign;

public class Subscriber {
    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name){
        super();
        this.name=name;
    }

    public void update(){
        System.out.println("Hey, "+ name + " Video Updated.."+channel.title);
    }

    public void SubscribeChannel(Channel ch){
        channel=ch;
    }
}
