package com.library.SendNotificationFeature;

import com.library.SendNotificationFeature.Observable.BookStockObservable;
import com.library.SendNotificationFeature.Observable.BookStockObservableImpl;
import com.library.SendNotificationFeature.Observer.EmailNotificationAlertObserver;
import com.library.SendNotificationFeature.Observer.NotificationAlertObserver;
import com.library.SendNotificationFeature.Observer.PhoneNotificationAlertObserver;

public class Main {
    public static void main(String[] args) {



        NotificationAlertObserver observer1 = new PhoneNotificationAlertObserver(12345667);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("abc@sd.c");
        NotificationAlertObserver observer3 = new PhoneNotificationAlertObserver(67675456);
        NotificationAlertObserver observer4 = new EmailNotificationAlertObserver("hhgh@sd.c");

        BookStockObservable bookStockObservable = new BookStockObservableImpl();
        bookStockObservable.addBookStockObserver("Godan", observer1);
        bookStockObservable.addBookStockObserver("Champak", observer1);
        bookStockObservable.addBookStockObserver("The Secret Wish List", observer2);
        bookStockObservable.addBookStockObserver("Harry Potter", observer2);
        bookStockObservable.addBookStockObserver("Rich Dad , Poor Dad", observer3);
        bookStockObservable.addBookStockObserver("Power of Subconsious Mind", observer3);
        bookStockObservable.addBookStockObserver("Hira Moti", observer1);
        bookStockObservable.addBookStockObserver("Godan", observer2);
        bookStockObservable.addBookStockObserver("Champak", observer3);
        bookStockObservable.addBookStockObserver("The Secret Wish List", observer1);
        bookStockObservable.addBookStockObserver("Harry Potter", observer3);
        bookStockObservable.addBookStockObserver("Rich Dad , Poor Dad", observer2);
        bookStockObservable.addBookStockObserver("Power of Subconsious Mind", observer1);
        bookStockObservable.addBookStockObserver("Hira Moti", observer2);

        bookStockObservable.addBookStock("Godan",5);
        bookStockObservable.addBookStock("Hira Moti",2);
        bookStockObservable.addBookStock("Champak",7);
        bookStockObservable.addBookStock("The Secret Wish List",4);
        bookStockObservable.addBookStock("Harry Potter",5);
        bookStockObservable.addBookStock("Rich Dad , Poor Dad",6);
        bookStockObservable.addBookStock("Power of Subconsious Mind",8);

        bookStockObservable.getAllBookStock();


    }
}
