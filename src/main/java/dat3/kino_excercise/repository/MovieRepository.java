package dat3.kino_excercise.repository;

import dat3.kino_excercise.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
