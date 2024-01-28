package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class Channel {
        List<Subscriber> subs= new ArrayList<>();
        public String title;
        public void Subscribe(Subscriber sub){
            subs.add(sub);
        }
        public void unSubscribe(Subscriber sub){
            subs.remove(sub);
        }
        public void notifySubscriber(){
            for(Subscriber sub:subs){
                sub.update();
            }
        }
        public void upload(String title){
            this.title=title;
            notifySubscriber();
        }
}
