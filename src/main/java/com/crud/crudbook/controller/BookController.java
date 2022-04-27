package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Book;
import com.crud.crudbook.service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BookController {

    @Autowired
    private BookServiceInterface service;

    @GetMapping("get/books")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping("save/book")
    public Book saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PutMapping("update/book")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("delete/book/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }

}
