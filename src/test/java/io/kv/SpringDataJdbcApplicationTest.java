package io.kv;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

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
        Set<Rental> rentals = new HashSet<>();
        rentals.add(new Rental(Duration.ofDays(1), 5));
        rentals.add(new Rental(Duration.ofDays(7), 15));

        Movie movie = new Movie(null, "Kantara", "Awesome", rentals);

        movieRepository.save(movie);

        Iterable<Movie> movies = movieRepository.findAll();
        assertThat(movies).hasSize(1);

        System.out.println(movies);

    }
}