package com.library.Models.Actors;

import com.library.Models.Books.BookItem;
import com.library.Services.BookIssueService;
import com.library.Services.SearchService;

public class Librarian extends SystemUser{
    SearchService searchBook;
    BookIssueService issueBook;

    public void addBook(BookItem book){

    }
    public BookItem editBook(BookItem book){
        return null;
    }
    public BookItem removeBook(int id){
        return null;
    }
}
