package com.example.demo.controller;

import com.example.demo.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String helloWorld(){
        return "Hello book";
    }

    @GetMapping(value={"/book","/java"})
//    @ResponseBody
    public Book getBook(){
        Book book = new Book(1,"Core Java","Latest java library");
        return book;
    }

    @PostMapping(path="/books/create")
    public ResponseEntity<Book>createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book,HttpStatus.CREATED);
    }

    @PutMapping(value = "/books/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id,@RequestBody Book updatedBook){
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        updatedBook.setId(id);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book Deleted succesfully");
    }

    @GetMapping("/books/{id}/{name}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id,@PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        Book newBook = new Book();
        newBook.setId(id);
        newBook.setTitle(name);
        return ResponseEntity.ok(newBook);
    }
}
