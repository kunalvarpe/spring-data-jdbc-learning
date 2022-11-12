package io.kv;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Movie {

    @Id
    Long id;
    private String title;
    private String description;
    private List<Rental> rental;

    public Movie(Long id, String title, String description, List<Rental> rental) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rental = rental;
    }

    public void addRental(Rental rental) {
        this.rental.add(rental);
    }

    @Override
    public String toString() {
        return "Movie{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", rental=" + rental +
               '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
