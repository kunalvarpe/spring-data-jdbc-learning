package io.kv;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJdbcApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SpringDataJdbcApplication.class);
    public static final String COURSE_LOG = "Course = {}";

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(CourseRepository courseRepository) {
        return args -> {
            Course course1 = Course.create("Java 17: The new world", LocalDate.of(2022, 10, 10));
            Course course2 = Course.create("Spring Boot 3: The place want to live in", LocalDate.of(2022, 11, 12));

            LOG.info(COURSE_LOG, courseRepository.save(course1));
            LOG.info(COURSE_LOG, courseRepository.save(course2));

            LOG.info(COURSE_LOG, courseRepository.findByName("Spring Boot 3: The place want to live in"));
        };
    }
}