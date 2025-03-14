package com.library.SendNotificationFeature.Observer;

public class PhoneNotificationAlertObserver implements NotificationAlertObserver{
    Integer mobNo;

    public PhoneNotificationAlertObserver(Integer mobNo) {
        this.mobNo = mobNo;
    }
    @Override
    public void update(String bookDetail) {
        System.out.println("Message sent about availablity of book: "+bookDetail+" to mobile no: "+mobNo);
    }
}
