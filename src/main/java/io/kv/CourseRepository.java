package io.kv;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends CrudRepository<Course, Long> {

    @Query("select * from course where name = :name")
    List<Course> findByName(@Param("name") String name);
}
