package example.micronaut.services;

import example.micronaut.domain.Book;
import example.micronaut.domain.Genre;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorPageableRepository;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;
import java.util.Set;

@Join(value = "genres", type = Join.Type.LEFT_FETCH)
@Repository
public interface BookRepository extends ReactorPageableRepository<Book, Long> {

    @Transactional
    default Mono<Book> updateGenres(Long id, Set<Genre> genres) {
        return findById(id).map( book -> {
                book.setGenres(genres);
                return book;
                });
    }
}
