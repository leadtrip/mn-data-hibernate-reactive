package example.micronaut.domain;

import io.micronaut.serde.annotation.Serdeable;

import javax.persistence.*;
import java.util.Set;

@Serdeable
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Book() {}

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private Set<Genre> genres;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genres=" + genres +
                '}';
    }
}
