package example.micronaut.commands;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class BookUpdateCommand {

    private Long id;
    private String name;
    private Set<Long> genres = Set.of();


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Long> getGenres() {
        return genres;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenres(Set<Long> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "BookUpdateCommand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genres=" + genres +
                '}';
    }
}
