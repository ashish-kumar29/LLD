package com.library.Models.Actors;

import com.library.Models.Books.BookItem;
import com.library.Services.BookIssueService;
import com.library.Services.SearchService;

import java.util.Date;
import java.util.List;

public class Member extends SystemUser{
    List<BookItem> bookItemIssued;
    Date MembershipValidityDate;
    SearchService BookSearch;
    BookIssueService issueService;
}
