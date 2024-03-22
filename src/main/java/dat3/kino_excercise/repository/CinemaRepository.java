package dat3.kino_excercise.repository;

import dat3.kino_excercise.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
}
