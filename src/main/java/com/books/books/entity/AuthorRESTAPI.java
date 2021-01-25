package com.books.books.entity;

import com.books.books.Repo.AuthorDto;
import com.books.books.Repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRESTAPI {

    private AuthorRepo authorRepo;

    @Autowired
    public AuthorRESTAPI (AuthorRepo authorRepo){
        this.authorRepo = authorRepo;
    }

    @GetMapping ("/getAuthorInfo")
    public List<AuthorDto> get()
    {
        return authorRepo.getCategoryCount();
    }
}
