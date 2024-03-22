package dat3.kino_excercise.service;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.entity.Cinema;
import dat3.kino_excercise.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaService {

    private CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<CinemaDto> getAllCinemas() {
        List<Cinema> cinemaList = cinemaRepository.findAll();
        List<CinemaDto> cinemaDtoList = new ArrayList<>();

        for (Cinema cinema : cinemaList) {
            cinemaDtoList.add(new CinemaDto(cinema));
        }
        return cinemaDtoList;
    }

}
