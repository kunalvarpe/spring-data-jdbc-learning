package io.kv;

import lombok.Getter;

import org.springframework.data.relational.core.mapping.Table;

@Table("book_author")
public class AuthorReference {
    @Getter
    private Long author;

    AuthorReference(Long author) {
        this.author = author;
    }
}
