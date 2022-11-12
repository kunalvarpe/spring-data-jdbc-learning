package io.kv;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;

import org.springframework.data.annotation.Id;

@Data
public class Author {
    @Id
    @Getter
    Long id;
    String name;
    LocalDate birthDate;
}
