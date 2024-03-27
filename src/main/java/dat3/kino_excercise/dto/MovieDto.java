package dat3.kino_excercise.dto;

import dat3.kino_excercise.entity.Movie;
import dat3.kino_excercise.entity.Theater;

import java.net.URL;

public class MovieDto {
private int id;
private String title;

private String description;

private String trailerUrl;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripttion() {
        return description;
    }

    public void setDescripttion(String descripttion) {
        this.description = descripttion;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public MovieDto (Movie m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.description = m.getDescription();
        this.trailerUrl=m.getTrailerUrl();
    }

}
