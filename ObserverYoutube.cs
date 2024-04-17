using System;
using System.Collections.Generic;

namespace ObserverDesign
{
    public class Channel
    {
        private List<Subscriber> subs = new List<Subscriber>();
        public string title;

        public void Subscribe(Subscriber sub)
        {
            subs.Add(sub);
        }

        public void UnSubscribe(Subscriber sub)
        {
            subs.Remove(sub);
        }

        public void NotifySubscriber()
        {
            foreach (Subscriber sub in subs)
            {
                sub.Update();
            }
        }

        public void Upload(string title)
        {
            this.title = title;
            NotifySubscriber();
        }
    }

    public interface IObserver
    {
        void Update();
        void SubscribeChannel(Channel ch);
    }

    public class Subscriber : IObserver
    {
        private string name;
        private Channel channel = new Channel();

        public Subscriber(string name)
        {
            this.name = name;
        }

        public void Update()
        {
            Console.WriteLine("Hey, " + name + " Video Updated.." + channel.title);
        }

        public void SubscribeChannel(Channel ch)
        {
            channel = ch;
        }
    }

    public class Youtube
    {
        public static void Main(string[] args)
        {
            Channel telusko = new Channel();
            Subscriber s1 = new Subscriber("Boult");
            Subscriber s2 = new Subscriber("Southee");

            telusko.Subscribe(s1);
            telusko.Subscribe(s2);
            telusko.UnSubscribe(s1);
            s1.SubscribeChannel(telusko);
            s2.SubscribeChannel(telusko);

            telusko.Upload("How to swing the ball?");
        }
    }
}
