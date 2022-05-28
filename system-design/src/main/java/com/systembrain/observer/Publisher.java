package com.systembrain.observer;

public interface Publisher {
    void sendNotification();
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
