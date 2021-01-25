package com.books.books.Repo;

import com.books.books.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {

    @Query(value = "select Author.name as Author, count (Author.name) as CategoryCount, Book.bookCategory as BookCategory\n " +
            "FROM Author, Book\n" + " group by bookCategory", nativeQuery = true)
List<AuthorDto> getCategoryCount();

}