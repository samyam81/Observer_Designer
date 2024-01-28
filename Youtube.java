package ObserverDesign;

public class Youtube {
    public static void main(String[] args) {
        Channel telusko=new Channel();
        Subscriber s1= new Subscriber("Boult");
        Subscriber s2= new Subscriber("Southee");
        
        telusko.Subscribe(s1);
        telusko.Subscribe(s2);
        telusko.unSubscribe(s1);
        s1.SubscribeChannel(telusko);
        s2.SubscribeChannel(telusko);

        telusko.upload("How to swing the ball?");

    }
}
