package dat3.kino_excercise.dto;

import dat3.kino_excercise.entity.Cinema;

public class CinemaDto {
    private int id;
    private String name;
    private int totalCapacity;
    private int numberOfTheaters;

    public CinemaDto(Cinema c) {
        this.id = c.getId();
        this.name = c.getName();
        this.totalCapacity = c.getTotalCapacity();
        this.numberOfTheaters = c.getNumberOfTheaters();
    }

}
