package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

	String mobNo;
	StockObservable observable;
	
	
	
	public MobileAlertObserverImpl(String mobNo, StockObservable observable) {
		this.mobNo = mobNo;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMobileNotification(mobNo, "Product is in stock, Hurry Up!");
	}

	private void sendMobileNotification(String mobNo, String msg) {
		System.out.println("Msg sent to "+mobNo+" "+msg);
	}

}
