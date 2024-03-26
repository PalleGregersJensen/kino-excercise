package dat3.kino_excercise.entity;

import jakarta.persistence.*;

@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int numberOfTheaterRows;
    private int numberOfSeatsInARow;
    @ManyToOne
    @JoinColumn(name = "cinema_id_fk")
    private Cinema cinema ;


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

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
