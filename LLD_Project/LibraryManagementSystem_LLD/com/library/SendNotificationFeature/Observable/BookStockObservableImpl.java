package com.library.SendNotificationFeature.Observable;

import com.library.SendNotificationFeature.Observer.NotificationAlertObserver;

import java.util.*;

public class BookStockObservableImpl implements BookStockObservable{

    Map<String, List<NotificationAlertObserver>> observerList = new HashMap<>();
    Map<String, Integer> bookStock = new HashMap<>();
    @Override
    public void addBookStockObserver(String book, NotificationAlertObserver notificationAlertObserver) {
        if(!observerList.containsKey(book)){
            observerList.put(book, new ArrayList<>());
        }
        observerList.get(book).add(notificationAlertObserver);
    }

    @Override
    public void removeBookStockObserver(String book) {
        observerList.remove(book);
    }

    @Override
    public void notifyAllObserver(String bookDetail) {
        for(NotificationAlertObserver observer: observerList.get(bookDetail)){
            observer.update(bookDetail);
        }
        removeBookStockObserver(bookDetail);
    }

    @Override
    public void addBookStock(String book, int stock) {
        if(bookStock.getOrDefault(book,0)==0){
            notifyAllObserver(book);
        }
        bookStock.put(book,bookStock.getOrDefault(book,0)+stock);
    }

    @Override
    public void removeBookStock(String book, int stock) {
        if(bookStock.getOrDefault(book,0)>=stock){
            bookStock.put(book,bookStock.get(book)-stock);
        }
    }

    @Override
    public int getBookStock(String book) {
        return bookStock.getOrDefault(book,0);
    }

    @Override
    public void getAllBookStock() {
        for(String key : bookStock.keySet()){
            System.out.println("Book: "+key+" and its stock count: "+bookStock.get(key));
        }
    }
}
