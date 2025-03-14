package com.library.SendNotificationFeature.Observer;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String emailId;

    public EmailNotificationAlertObserver(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update(String bookDetail) {
        System.out.println("Mail sent about availablity of book: "+bookDetail+" to email id: "+emailId);
    }
}
