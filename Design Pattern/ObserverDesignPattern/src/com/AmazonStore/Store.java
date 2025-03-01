package com.AmazonStore;

import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@xyz.c", iphoneStockObservable);
		NotificationAlertObserver observer2 = new MobileAlertObserverImpl("123546", iphoneStockObservable);
		NotificationAlertObserver observer3 = new EmailAlertObserverImpl("abc@mno.c", iphoneStockObservable);

		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);

		iphoneStockObservable.addStockCount(10);
		iphoneStockObservable.addStockCount(20);
		iphoneStockObservable.subtractStockCount(30);
		iphoneStockObservable.addStockCount(5);

	}

}
