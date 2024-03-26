package dat3.kino_excercise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int numberOfTheaterRows;
    private int numberOfSeatsInARow;


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
}
