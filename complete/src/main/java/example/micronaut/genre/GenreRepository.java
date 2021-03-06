package example.micronaut.genre;

import example.micronaut.PaginationArguments;
import example.micronaut.SortingArguments;
import example.micronaut.domain.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreRepository {

    Optional<Genre> findById(Long id);

    Genre save(String name);

    void deleteById(Long id);

    List<Genre> findAll(PaginationArguments paginationArgs, SortingArguments sortingArgs);

    int update(Long id, String name);
}
