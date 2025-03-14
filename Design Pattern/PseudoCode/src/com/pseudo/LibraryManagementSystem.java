package com.pseudo;

import java.util.Date;
import java.util.List;

public class LibraryManagementSystem {

}

class Library{
	String name;
	Location location;
	List<BookItem> bookItems;
	
}

class Location{
	String street;
	String area;
	String city;
	String state;
	String country;
	int pin;
}

class Book{
	int uniqueId;
	String title;
	List<Author> authors;
	Genre genre;
}

class BookItem extends Book{
	String barCode;
	Date publicationDate;
	ReservationStatus status;
	BookLanguage language;
	Rack rackLocation;
	Date issueDate;
	Double price;
}

enum Genre{
	ROMANCE, COMEDY, FICTION, MYSTERY, THRILLER, HORROR
}

enum ReservationStatus{
	ISSUED, AVAILABLE, NOT_AVAILABLE, OUT_OF_STOCK
}

enum BookLanguage{
	HINDI, ENGLISH, BENGALI, TAMIL
}

class Rack{
	int wallNo;
	int rowNumber;
	int columnNo;
}

class Person{
	String firstName;
	String lastName;
}

class Author extends Person{
	List<Book> booksPublished;
}

class SystemUser extends Person{
	Account accountDetails;
	String email;
	String mobNo;
}

class Member extends SystemUser{
	List<BookItem> bookItemsIssued;
	Search BookSearch;
	BookIssueService issueService;
	
}

class Librarian extends SystemUser{
	Search BookSearch;
	BookIssueService issueService;
	
	int addBook(BookItem bookDetails);
	BookItem editBook(BookItem bookDetail);
	BookItem deleteBook(int id);
}

class Account{
	String userName;
	String password;
	int userId;
}

class Search{
	public List<BookItem> getBookByTitle(String title);
	public List<BookItem> getBookByAuthor(Author author);
	public List<BookItem> getBookByGenre(Genre genre);
	public List<BookItem> getBookBypublicationDate(Date publicationDate);
}

class BookIssueService{
	FineService fineService;
	
	public BookReservationDetail getReservationDetail(BookItem book);
	
	public void updateBookReservationDetail(BookReservationDetail reservationDetail);
	
	public BookReservationDetail reserveBook(BookItem book, SystemUser user);
	
	public BookIssueDetail issueBook(BookItem book, SystemUser user);
	
//	this will internally call getReservationDetail() to check if book is available or not 
//	After that it will call issueBook() api
	public BookIssueDetail renewBook(BookItem book, SystemUser user);
	
	public void returnBook(BookItem book, SystemUser user);
	
}

class BookLending{
	Date startDate;
	BookItem book;
	SystemUser user;
}

class BookReservationDetail extends BookLending{
	ReservationStatus reservationStatus;
}

class BookIssueDetail extends BookLending{
	Date dueDate;
}
class FineService{
	public Fine calculateFine(BookItem book, SystemUser user, int extraDay);
}

class Fine{
	Date fineDate;
	BookItem book;
	SystemUser user;
	Double fineValue;
}