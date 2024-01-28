package ObserverDesign;

public interface Subject {
    void Subscribe(Subscriber sub);
    void unSubscribe(Subscriber sub);
    void notifySubscriber();
    void upload(String title);
}
