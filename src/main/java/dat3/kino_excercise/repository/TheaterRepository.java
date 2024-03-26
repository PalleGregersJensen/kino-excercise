package dat3.kino_excercise.repository;

import dat3.kino_excercise.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository <Theater, Integer> {
}
