package example.micronaut.commands;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class BookCreateCommand {

    private String name;

    private Set<Long> genres;

    public BookCreateCommand(String name, Set<Long> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getGenres() {
        return genres;
    }

    public void setGenres(Set<Long> genres) {
        this.genres = genres;
    }
}
