package com.BookMyShow.Service;

public class BookSeat {
    SelectSeat selectedSeat;
    PaymentService paymentService;
    boolean PAYMENTSUCCEED = true;
    boolean PAYMENTFAILED = false;
    public BookingResponse bookSelectedSeats(){
        if(paymentService.makePayment()){
            return new BookingResponse(PAYMENTSUCCEED, selectedSeat);
        }
        else{
            return new BookingResponse(PAYMENTFAILED, selectedSeat);
        }
    }
}
