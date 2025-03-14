package com.library.Services;

import com.library.Models.Actors.SystemUser;
import com.library.Models.Books.BookItem;
import com.library.Models.Transaction.BookIssueDetail;
import com.library.Models.Transaction.BookReservationDetail;

public class BookIssueService {
    FineService fine;
    public BookReservationDetail getReservationDetail(BookItem book){
        return null;
    }

    public void updateBookReservationDetail(BookReservationDetail bookReservationDetail){

    }

    public BookReservationDetail reserveBook(BookItem book, SystemUser user) {
        return null;
    }

    public BookIssueDetail issueBook(BookItem book, SystemUser user){
        return null;
    }

    public BookIssueDetail renewBook(BookItem book, SystemUser user){
        return null;
    }

    public void returnBook(BookItem book, SystemUser user){

    }

}
