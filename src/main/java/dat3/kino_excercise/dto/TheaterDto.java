package dat3.kino_excercise.dto;

import dat3.kino_excercise.api.TheaterController;
import dat3.kino_excercise.entity.Cinema;
import dat3.kino_excercise.entity.Theater;

public class TheaterDto {
    private int id;
    private String name;
    private int numberOfTheaterRows;
    private int numberOfSeatsInARow;
    private int totalNumberOfSeats;
    private Cinema cinema;

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

    public int getNumberOfTheaterRows() {
        return numberOfTheaterRows;
    }

    public void setNumberOfTheaterRows(int numberOfTheaterRows) {
        this.numberOfTheaterRows = numberOfTheaterRows;
    }

    public int getNumberOfSeatsInARow() {
        return numberOfSeatsInARow;
    }

    public void setNumberOfSeatsInARow(int numberOfSeatsInARow) {
        this.numberOfSeatsInARow = numberOfSeatsInARow;
    }

    public int getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public TheaterDto (Theater t) {
        this.id = t.getId();
        this.name = t.getName();
        this.numberOfSeatsInARow = t.getNumberOfSeatsInARow();
        this.numberOfTheaterRows = t.getNumberOfTheaterRows();
        this.cinema = t.getCinema();
        this.totalNumberOfSeats = (t.getNumberOfSeatsInARow())*(t.getNumberOfTheaterRows());
    }

}
