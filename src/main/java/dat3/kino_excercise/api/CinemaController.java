package dat3.kino_excercise.api;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cinema")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<CinemaDto> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }


}
