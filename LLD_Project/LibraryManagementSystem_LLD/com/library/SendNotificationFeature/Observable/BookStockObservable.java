package com.library.SendNotificationFeature.Observable;

import com.library.SendNotificationFeature.Observer.NotificationAlertObserver;

import java.util.List;

public interface BookStockObservable {

    public void addBookStockObserver(String book, NotificationAlertObserver notificationAlertObserver);
    public void removeBookStockObserver(String book);
    public void notifyAllObserver(String bookDetail);
    public void addBookStock(String book, int stock);
    public void removeBookStock(String book, int stock);
    public int getBookStock(String book);
    public void getAllBookStock();
}
