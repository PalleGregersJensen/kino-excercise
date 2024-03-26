package dat3.kino_excercise.api;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.dto.TheaterDto;
import dat3.kino_excercise.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/theater")
public class TheaterController {

        @Autowired
        private TheaterService theaterService;

        @GetMapping
        public List<TheaterDto> getAllTheaters() {
            return theaterService.getAllTheaters();
        }

    }
