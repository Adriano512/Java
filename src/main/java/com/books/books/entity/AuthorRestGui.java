package com.books.books.entity;

import com.books.books.Repo.AuthorDto;
import com.books.books.Repo.AuthorRepo;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Route
public class AuthorRestGui extends VerticalLayout {

    private AuthorRepo authorRepo;

    public AuthorRestGui (AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;

        List<AuthorDto> personList = new ArrayList<>();

        Grid<AuthorDto> grid = new Grid<>(AuthorDto.class);
        grid.setItems(personList);
        add(grid);
    }
}
