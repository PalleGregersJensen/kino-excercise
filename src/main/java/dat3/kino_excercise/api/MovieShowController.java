package dat3.kino_excercise.api;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.dto.MovieShowDto;
import dat3.kino_excercise.service.CinemaService;
import dat3.kino_excercise.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movieshow")
public class MovieShowController {

    @Autowired
    private MovieShowService movieShowService;

    @GetMapping
    public List<MovieShowDto> getAllMovieShows() {
        return movieShowService.getAllMovieShows();
    }

}
