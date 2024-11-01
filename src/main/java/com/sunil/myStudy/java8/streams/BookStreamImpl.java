/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookStreamImpl
{
	
	private static final Logger log = LoggerFactory.getLogger(BookStreamImpl.class);
	
	public static void main(String[] args)
	{
		Book java = new Book("Java", "James Gosling", 1500);
		Book python = new Book("Python", "Guido van Rossum", 1050);
		Book php = new Book("PHP", "Rasmus Lerdorf", 480);
		
		List<Book> books = new ArrayList<Book>();
		books.add(java);
		books.add(python);
		books.add(php);
				
		Object[] objArr = books.toArray();
		Book[] bookArr = books.toArray(Book[] :: new);
		
		Optional<Book> expensiveBook = books.stream().max(Comparator.comparing(Book :: getPrice));
		expensiveBook.ifPresent(data->log.info("Expensive : "+data.toString()));
		//or
		if(expensiveBook.isPresent())
		{
			Book book = expensiveBook.get();
			log.info("Expensive : "+book.toString());
		}		
		
		Optional<Book> cheapBook = books.stream().min(Comparator.comparing(Book :: getPrice));
		cheapBook.ifPresent(data->log.info("Cheap : "+data.toString()));
		if(cheapBook.isPresent())
		{
			Book book = cheapBook.get();
			log.info("Cheap : "+book.toString());;
		}
		
	}
	
}
