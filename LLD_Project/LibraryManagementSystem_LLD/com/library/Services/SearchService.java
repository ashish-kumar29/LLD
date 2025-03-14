package com.library.Services;

import com.library.Models.Actors.Author;
import com.library.Models.Books.BookItem;
import com.library.Models.Books.BookLanguage;
import com.library.Models.Books.Genre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchService {
    public List<BookItem> findBookByTitle(String title){
        List<BookItem> bookItemList = new ArrayList<>();
        /*
        BusinessLogic
         */
        return bookItemList;
    }
    public List<BookItem> findBookByAuthor(Author author){
        List<BookItem> bookItemList = new ArrayList<>();
        /*
        BusinessLogic
         */
        return bookItemList;
    }
    public List<BookItem> findBookByGenre(Genre genre){
        List<BookItem> bookItemList = new ArrayList<>();
        /*
        BusinessLogic
         */
        return bookItemList;
    }
    public List<BookItem> findBookByLanguage(BookLanguage language){
        List<BookItem> bookItemList = new ArrayList<>();
        /*
        BusinessLogic
         */
        return bookItemList;
    }
    public List<BookItem> findBookByPublishionDate(Date publishionDate){
        List<BookItem> bookItemList = new ArrayList<>();
        /*
        BusinessLogic
         */
        return bookItemList;
    }
}
