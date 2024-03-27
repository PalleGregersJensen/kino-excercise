package dat3.kino_excercise.service;

import dat3.kino_excercise.dto.MovieDto;
import dat3.kino_excercise.dto.TheaterDto;
import dat3.kino_excercise.entity.Movie;
import dat3.kino_excercise.entity.Theater;
import dat3.kino_excercise.repository.MovieRepository;
import dat3.kino_excercise.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public List<MovieDto> getAllMovies() {
        List<Movie> movieList = movieRepository.findAll();
        List<MovieDto> movieDtoList= new ArrayList<>();

        for (Movie movie : movieList) {
            movieDtoList.add(new MovieDto(movie));
        }
        return movieDtoList;
    }

}
