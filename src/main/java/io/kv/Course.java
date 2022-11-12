package io.kv;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Course { // table 'course'
    @Id
    private Long id;
    private String name;
    private LocalDate publishedAt; // 'published_at'

    Course(Long id, String name, LocalDate publishedAt) {
        this.id = id;
        this.name = name;
        this.publishedAt = publishedAt;
    }

    static Course create(String name, LocalDate publishedAt) {
        return new Course(null, name, publishedAt);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", publishedAt=" + publishedAt +
               '}';
    }
}
