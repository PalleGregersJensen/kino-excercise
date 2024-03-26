package dat3.kino_excercise.api;

import dat3.kino_excercise.dto.CinemaDto;
import dat3.kino_excercise.dto.TheaterDto;
import dat3.kino_excercise.entity.Theater;
import dat3.kino_excercise.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theater")
public class TheaterController {

        @Autowired
        private TheaterService theaterService;

        //Get all theaters
        @GetMapping
        public List<TheaterDto> getAllTheaters() {
            return theaterService.getAllTheaters();
        }


        //Post new theater
        @PostMapping("")
    public Theater addTheater(@RequestBody Theater theater){
            return theaterService.createNewTheater(theater);
        }

    }
