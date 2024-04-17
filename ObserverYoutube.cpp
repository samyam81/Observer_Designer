#include <iostream>
#include <vector>

// Observer Interface
class IObserver {
public:
    virtual void Update() = 0;
};

// Channel Class
class Channel {
private:
    std::vector<IObserver*> observers;
    std::string title;

public:
    void Subscribe(IObserver* observer) {
        observers.push_back(observer);
    }

    void UnSubscribe(IObserver* observer) {
        observers.erase(std::remove(observers.begin(), observers.end(), observer), observers.end());
    }

    void NotifyObservers() {
        for (IObserver* observer : observers) {
            observer->Update();
        }
    }

    void Upload(std::string title) {
        this->title = title;
        NotifyObservers();
    }
};

// Subscriber Class
class Subscriber : public IObserver {
private:
    std::string name;
    Channel* channel;

public:
    Subscriber(std::string name) : name(name), channel(nullptr) {}

    void Update() override {
        std::cout << "Hey, " << name << " Video Updated.." << channel->title << std::endl;
    }

    void SubscribeChannel(Channel* ch) {
        channel = ch;
    }
};

// Main Function
int main() {
    Channel samyam;
    Subscriber s1("Boult");
    Subscriber s2("Southee");

    samyam.Subscribe(&s1);
    samyam.Subscribe(&s2);
    samyam.UnSubscribe(&s1);
    s1.SubscribeChannel(&samyam);
    s2.SubscribeChannel(&samyam);

    samyam.Upload("How to swing the ball?");

    return 0;
}
