package com.library.Models.Transaction;

import com.library.Models.Actors.SystemUser;
import com.library.Models.Books.BookItem;

import java.util.Date;

public class Fine {
    Date startDate;
    Date lastSubmissionDate;
    SystemUser user;
    BookItem book;
    int totalFineDays;
    Double totalFine;
}
