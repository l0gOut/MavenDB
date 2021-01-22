package ru.sapteh.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private int id;
    @NonNull private String title;
    @NonNull private String author;
    @NonNull private String publication;
}
