package io.kv;

import org.springframework.data.annotation.Id;

public class Movie {

    @Id
    Long id;
    private String title;
    private String description;
    private Rental rental;

    public Movie(Long id, String title, String description, Rental rental) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rental = rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
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
}
