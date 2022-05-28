package com.systembrain.observer;

public class ObserverMain {

    public static void main(String[] args){
        Observer observer1 = new Subscriber("Mike");
        Observer observer2 = new Subscriber("John");
        Observer observer3 = new Subscriber("Jenny");

        Publisher publisher = new PublisherImpl();
        publisher.subscribe(observer1);
        publisher.subscribe(observer2);
        publisher.subscribe(observer3);

        publisher.sendNotification();

    }

}
