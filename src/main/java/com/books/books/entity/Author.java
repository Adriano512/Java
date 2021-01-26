package com.books.books.entity;
import javax.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Author {

    @OneToMany
    @JoinColumn(name = "Author_Id")
    private Set<Book> bookSet;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;

}
