package dat3.kino_excercise.service;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.dto.TheaterDto;
import dat3.kino_excercise.entity.Cinema;
import dat3.kino_excercise.entity.Theater;
import dat3.kino_excercise.repository.CinemaRepository;
import dat3.kino_excercise.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    private TheaterRepository theaterRepository;

    public TheaterService(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    public List<TheaterDto> getAllTheaters() {
        List<Theater> theaterList = theaterRepository.findAll();
        List<TheaterDto> theaterDtoList = new ArrayList<>();

        for (Theater theater : theaterList) {
            theaterDtoList.add(new TheaterDto(theater));
        }
        return theaterDtoList;
    }

}
