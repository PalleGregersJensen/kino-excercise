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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getNumberOfTheaters() {
        return numberOfTheaters;
    }

    public void setNumberOfTheaters(int numberOfTheaters) {
        this.numberOfTheaters = numberOfTheaters;
    }
}
