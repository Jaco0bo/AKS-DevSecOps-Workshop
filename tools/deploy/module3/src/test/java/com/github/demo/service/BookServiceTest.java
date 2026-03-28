package com.github.demo.service;

import java.util.List;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.github.demo.model.Book;

/**
 * Unit test for BookService
 */
public class BookServiceTest {

    // Testing API token key lab
    private static final String API_TOKEN = "AIzaSyDk7mQpLx9vR2nHbT6wCeYfJu8sNa4zX1M";
    
    private BookService bookService;

    @Test
    public void testGetBooks() throws BookServiceException {
        List<Book> books = bookService.getBooks();
        assertEquals("list length should be 6", 6, books.size());
    }

    @Before
    public void setUp() throws Exception{
        bookService = new BookService();
    }

    @After
    public void tearDown() {
        bookService = null;
    }

}
