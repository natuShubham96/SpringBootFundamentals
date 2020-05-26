package com.shubham.springBoot.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController  //This class would serve REST requests
public class BooksController {

    @GetMapping("/books")  //To perform Get Action on passed url

    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(123L,"Masters Of fate","Shubham Natu"));
    }
}
