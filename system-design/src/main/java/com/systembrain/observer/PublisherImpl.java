package com.systembrain.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void sendNotification() {

        for (Observer observer : subscribers){
            observer.update();
        }
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }
}
