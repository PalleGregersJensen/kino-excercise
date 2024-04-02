package dat3.kino_excercise.service;

import dat3.kino_excercise.dto.MovieShowDto;
import dat3.kino_excercise.dto.TheaterDto;
import dat3.kino_excercise.entity.MovieShow;
import dat3.kino_excercise.entity.Theater;
import dat3.kino_excercise.repository.MovieShowRepository;
import dat3.kino_excercise.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieShowService {
    private MovieShowRepository movieShowRepository;

    public MovieShowService(MovieShowRepository movieShowRepository) {
        this.movieShowRepository = movieShowRepository;
    }

    public List<MovieShowDto> getAllMovieShows() {
        List<MovieShow> movieShowList = movieShowRepository.findAll();
        List<MovieShowDto> movieShowDtoList = new ArrayList<>();

        for (MovieShow movieShow : movieShowList) {
            movieShowDtoList.add(new MovieShowDto(movieShow));
        }
        return movieShowDtoList;
    }

    public MovieShow createNewMovieShow(MovieShow movieShow) {
        return movieShowRepository.save(movieShow);
    }

}
