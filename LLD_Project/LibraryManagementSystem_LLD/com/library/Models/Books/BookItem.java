package com.library.Models.Books;

import java.util.Date;

public class BookItem extends Book{
    String barCode;
    Date publishDate;
    ReservationStatus status;
    BookLanguage language;
    Rack rackLocation;
    Date issueDate;
    int price;
    int availableCopies;
}
