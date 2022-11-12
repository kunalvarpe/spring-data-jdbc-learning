package io.kv;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SpringDataJdbcApplicationTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    void contextLoads() {
        Movie movie = new Movie(null, "Kantara", "Awesome",
                                new Rental(Duration.ofDays(1), 5));

        movieRepository.save(movie);

        Iterable<Movie> movies = movieRepository.findAll();
        assertThat(movies).hasSize(1);
        System.out.println(movies);
    }
}