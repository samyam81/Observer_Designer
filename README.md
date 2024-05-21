# Observer Designer

This repository contains implementations of the Observer design pattern in various programming languages. The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Java Implementation

### `ObserverDesign` Package

#### `Channel` Class
- Represents a channel that subscribers can subscribe to.
- Methods:
  - `Subscribe(Subscriber sub)`: Subscribes a subscriber to the channel.
  - `UnSubscribe(Subscriber sub)`: Unsubscribes a subscriber from the channel.
  - `NotifySubscriber()`: Notifies all subscribers when an upload occurs.
  - `Upload(String title)`: Uploads a new video with the given title.

#### `Subscriber` Interface
- Represents an observer that can subscribe to channels.
- Methods:
  - `Update()`: Method to be implemented by concrete subscribers to update them about changes.
  - `SubscribeChannel(Channel ch)`: Subscribes the observer to a specific channel.

#### `Main` Class
- Contains the main method for testing the Observer pattern implementation.

## C++ Implementation

### `ObserverDesign` Namespace

#### `IObserver` Class
- Abstract class representing an observer.
- Methods:
  - `Update()`: Virtual method to be overridden by concrete observers.

#### `Channel` Class
- Represents a channel that observers can subscribe to.
- Methods:
  - `Subscribe(IObserver* observer)`: Subscribes an observer to the channel.
  - `UnSubscribe(IObserver* observer)`: Unsubscribes an observer from the channel.
  - `NotifyObservers()`: Notifies all subscribed observers.
  - `Upload(std::string title)`: Uploads a new video with the given title.

#### `Subscriber` Class
- Represents a subscriber that observes a channel.
- Methods:
  - `Update()`: Updates the subscriber about changes in the channel.

#### `Main` Function
- Contains the main function for testing the C++ Observer pattern implementation.

## C# Implementation

### `ObserverDesign` Namespace

#### `Channel` Class
- Represents a channel that subscribers can subscribe to.
- Methods:
  - `Subscribe(Subscriber sub)`: Subscribes a subscriber to the channel.
  - `UnSubscribe(Subscriber sub)`: Unsubscribes a subscriber from the channel.
  - `NotifySubscriber()`: Notifies all subscribers when an upload occurs.
  - `Upload(String title)`: Uploads a new video with the given title.

#### `IObserver` Interface
- Represents an observer that can subscribe to channels.
- Methods:
  - `Update()`: Method to be implemented by concrete subscribers to update them about changes.
  - `SubscribeChannel(Channel ch)`: Subscribes the observer to a specific channel.

#### `Subscriber` Class
- Represents a subscriber that observes a channel.
- Methods:
  - `Update()`: Updates the subscriber about changes in the channel.

#### `Youtube` Class
- Contains the main method for testing the C# Observer pattern implementation.

Feel free to explore each language-specific implementation for more details and usage examples.
