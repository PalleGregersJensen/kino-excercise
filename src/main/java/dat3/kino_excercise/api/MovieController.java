package dat3.kino_excercise.api;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.dto.MovieDto;
import dat3.kino_excercise.service.CinemaService;
import dat3.kino_excercise.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieDto> getAllMovies() {
        return movieService.getAllMovies();
    }

}
