package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	
	String emailId;
	StockObservable observable;
	
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendEmailNotification(emailId, "Product is in stock, hurry Up!");
	}

	private void sendEmailNotification(String emailId, String msg) {
		System.out.println("mail sent to "+emailId+" "+msg);
		
	}

}
