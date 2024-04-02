package dat3.kino_excercise.dto;

import dat3.kino_excercise.entity.Movie;
import dat3.kino_excercise.entity.MovieShow;
import dat3.kino_excercise.entity.Theater;

import java.time.LocalDateTime;

public class MovieShowDto {
    private int id;
    private LocalDateTime startTimeStamp;
    private LocalDateTime endTimeStamp;
    private Movie movie;
    private Theater theater;

    public MovieShowDto (MovieShow m){
        this.id = m.getId();
        this.startTimeStamp = m.getStartTimestamp();
        this.endTimeStamp = m.getEndTimeStamp();
        this.movie = m.getMovie();
        this.theater = m.getTheater();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(LocalDateTime startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public LocalDateTime getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(LocalDateTime endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
