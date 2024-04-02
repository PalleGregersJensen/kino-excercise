package dat3.kino_excercise.repository;

import dat3.kino_excercise.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieShowRepository extends JpaRepository <MovieShow, Integer> {
}
