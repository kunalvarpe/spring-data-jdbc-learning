package io.kv;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;


@DataJdbcTest
class JdbcTests {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void testManyToManyRelation() {

        Author author = new Author();
        author.setName("J.J Martine");

        authorRepository.save(author);

        Book book = new Book();
        book.setId(null);
        book.setTitle("Song of Ice and Fire");
        book.setIsbn("12387629");

        book.addAuthor(author);

        bookRepository.save(book);

    }
}
