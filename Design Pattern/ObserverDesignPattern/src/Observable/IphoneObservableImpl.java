package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{
	
	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount=0;
	
	@Override
	public void add(NotificationAlertObserver alertObserver) {
		observerList.add(alertObserver);
	}
	@Override
	public void remove(NotificationAlertObserver alertObserver) {
		observerList.remove(alertObserver);
	}
	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer: observerList) {
			observer.update();
		}
		
	}
	@Override
	public void addStockCount(int newStockAdded) {
		if(stockCount==0) notifySubscribers();
		
		stockCount += newStockAdded;
	}
	@Override
	public int getStockCount() {
		return stockCount;
	}
	@Override
	public void subtractStockCount(int stockRemoved) {
		if(stockCount>=stockRemoved) stockCount-=stockRemoved;
	}
}
