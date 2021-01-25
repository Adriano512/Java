package com.books.books;
import com.books.books.Repo.AuthorRepo;
import com.books.books.Repo.BookRepo;
import com.books.books.entity.Author;
import com.books.books.entity.Book;
import com.books.books.entity.BookCategory;
import com.books.books.entity.BookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Main {

    private AuthorRepo authorRepo;
    private BookRepo bookrepo;

    @Autowired
    public Main(AuthorRepo authorRepo, BookRepo bookRepo) {

        this.authorRepo=authorRepo;
        this.bookrepo=bookRepo;

        Book book = new Book ();
        book.setBookCategory(BookCategory.Belletristic);
        book.setTitle("Zbrodnia i kara");
        book.setBookType(BookType.Audiobook);

        Book book2 = new Book ();
        book2.setBookCategory(BookCategory.Belletristic);
        book2.setTitle("Idiota");
        book2.setBookType(BookType.Audiobook);

        Book book3 = new Book ();
        book3.setBookCategory(BookCategory.Belletristic);
        book3.setTitle("Droga przez meke");
        book3.setBookType(BookType.Audiobook);

        Author author = new Author();
        author.setName("Fiodor");
        author.setSurname("Dostoyevski");
        author.setBookSet(Stream.of(book, book2).collect(Collectors.toSet()));

        Author author2 = new Author();
        author2.setName("Michail");
        author2.setSurname("Bulchakov");
       // author2.setBookSet(Stream.of().collect(Collectors.toSet()));

        Author author3 = new Author();
        author3.setName("Aleksiej");
        author3.setSurname("Tolstoj");
        author3.setBookSet(Stream.of(book3).collect(Collectors.toSet()));

        bookRepo.save(book);
        bookRepo.save(book2);
        bookRepo.save(book3);
        authorRepo.save(author);
        authorRepo.save(author2);
        authorRepo.save(author3);

    }
}
