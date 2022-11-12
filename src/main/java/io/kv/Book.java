package io.kv;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class Book {
    @Id
    Long id;
    String title;
    String isbn;
    Set<AuthorReference> authors = new HashSet<>();

    public void addAuthor(Author author) {
        authors.add(new AuthorReference(author.getId()));
    }
}
