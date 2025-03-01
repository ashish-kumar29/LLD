package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
	public void add(NotificationAlertObserver alertObserver);
	
	public void remove(NotificationAlertObserver alertObserver);
	
	public void notifySubscribers();

	public void addStockCount(int newStockAdded);
	
	public void subtractStockCount(int StockRemoved);
	
	public int getStockCount();
}
