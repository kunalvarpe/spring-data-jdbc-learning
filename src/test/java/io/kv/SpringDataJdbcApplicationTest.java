package io.kv;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
        List<Rental> rentals = new ArrayList<>();
        rentals.add(new Rental(Duration.ofDays(1), 5));
        rentals.add(new Rental(Duration.ofDays(7), 15));

        Movie movie = new Movie(null, "Kantara", "Awesome", rentals);

        movieRepository.save(movie);

        movie.setTitle("Kantara2");
        movieRepository.save(movie);

        Iterable<Movie> movies = movieRepository.findAll();
        System.out.println(movies);


        assertThat(movies).hasSize(1);


    }
}