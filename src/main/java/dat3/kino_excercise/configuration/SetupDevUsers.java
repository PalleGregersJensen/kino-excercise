package dat3.kino_excercise.configuration;

import dat3.kino_excercise.entity.Cinema;
import dat3.kino_excercise.entity.Movie;
import dat3.kino_excercise.entity.MovieShow;
import dat3.kino_excercise.entity.Theater;
import dat3.kino_excercise.repository.CinemaRepository;
import dat3.kino_excercise.repository.MovieRepository;
import dat3.kino_excercise.repository.MovieShowRepository;
import dat3.kino_excercise.repository.TheaterRepository;
import dat3.kino_excercise.service.CinemaService;
import dat3.security.entity.Role;
import dat3.security.entity.UserWithRoles;
import dat3.security.repository.RoleRepository;
import dat3.security.repository.UserWithRolesRepository;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Component
public class SetupDevUsers implements ApplicationRunner {

    MovieShowRepository movieShowRepository;

    MovieRepository movieRepository;

    TheaterRepository theaterRepository;
    CinemaRepository cinemaRepository;

    UserWithRolesRepository userWithRolesRepository;
    RoleRepository roleRepository;
    PasswordEncoder pwEncoder;
    String passwordUsedByAll;

    public SetupDevUsers(UserWithRolesRepository userWithRolesRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, CinemaRepository cinemaRepository, TheaterRepository theaterRepository, MovieRepository movieRepository, MovieShowRepository movieShowRepository) {
        this.userWithRolesRepository = userWithRolesRepository;
        this.roleRepository = roleRepository;
        this.pwEncoder = passwordEncoder;
        this.cinemaRepository = cinemaRepository;
        this.theaterRepository = theaterRepository;
        this.movieRepository = movieRepository;
        this.movieShowRepository = movieShowRepository;

        passwordUsedByAll = "test12";
    }

    public void run(ApplicationArguments args) {
        setupAllowedRoles();
        setupUserWithRoleUsers();
    }

    private void setupAllowedRoles(){
        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));
    }

     /*****************************************************************************************
     IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     NEVER  COMMIT/PUSH CODE WITH DEFAULT CREDENTIALS FOR REAL
     iT'S ONE OF THE TOP SECURITY FLAWS YOU CAN DO
     If you see the lines below in log-outputs on Azure, forget whatever had your attention on, AND FIX THIS PROBLEM
     *****************************************************************************************/
    private void setupUserWithRoleUsers() {
        Role roleUser = roleRepository.findById("USER").orElseThrow(()-> new NoSuchElementException("Role 'user' not found"));
        Role roleAdmin = roleRepository.findById("ADMIN").orElseThrow(()-> new NoSuchElementException("Role 'admin' not found"));
        System.out.println("******************************************************************************");
        System.out.println("********** IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ************");
        System.out.println();
        System.out.println("******* NEVER  COMMIT/PUSH CODE WITH DEFAULT CREDENTIALS FOR REAL ************");
        System.out.println("******* REMOVE THIS BEFORE DEPLOYMENT, AND SETUP DEFAULT USERS DIRECTLY  *****");
        System.out.println("**** ** ON YOUR REMOTE DATABASE                 ******************************");
        System.out.println();
        System.out.println("******************************************************************************");
        UserWithRoles user1 = new UserWithRoles("user1", pwEncoder.encode(passwordUsedByAll), "user1@a.dk");
        UserWithRoles user2 = new UserWithRoles("user2", pwEncoder.encode(passwordUsedByAll), "user2@a.dk");
        UserWithRoles user3 = new UserWithRoles("user3", pwEncoder.encode(passwordUsedByAll), "user3@a.dk");
        UserWithRoles user4 = new UserWithRoles("user4", pwEncoder.encode(passwordUsedByAll), "user4@a.dk");
        user1.addRole(roleUser);
        user1.addRole(roleAdmin);
        user2.addRole(roleUser);
        user3.addRole(roleAdmin);
        userWithRolesRepository.save(user1);
        userWithRolesRepository.save(user2);
        userWithRolesRepository.save(user3);
        userWithRolesRepository.save(user4);

        //Test data for cinamas
        Cinema cinema1 = new Cinema();
        cinema1.setId(1);
        cinema1.setName("Biograf1");
        cinema1.setNumberOfTheaters(2);
        //cinema1.setTotalCapacity(350);
        cinemaRepository.save(cinema1);

        //Test data for theaters
        Theater theater1 = new Theater();
        theater1.setId(1);
        theater1.setName("Biografsal 1");
        theater1.setNumberOfTheaterRows(20);
        theater1.setNumberOfSeatsInARow(12);
        theater1.setCinema(cinema1);
        theaterRepository.save(theater1);

        //Test data for theaters
        Theater theater2 = new Theater();
        theater2.setId(2);
        theater2.setName("Biografsal 2");
        theater2.setNumberOfTheaterRows(25);
        theater2.setNumberOfSeatsInARow(16);
        theater2.setCinema(cinema1);
        theaterRepository.save(theater2);

        //Test data for movies
        Movie movie1 = new Movie();
        movie1.setId(1);
        movie1.setTitle("Filmtitel 1");
        movie1.setDescription("Virkelig god film. Se den!");
        movie1.setTrailerUrl("https://www.dr.dk");
        movieRepository.save(movie1);

        Movie movie2 = new Movie();
        movie2.setId(2);
        movie2.setTitle("Filmtitel 2");
        movie2.setDescription("Virkelig, virkelig god film. Se den!");
        movie2.setTrailerUrl("https://www.dr.dk");
        movieRepository.save(movie2);

        Movie movie3 = new Movie();
        movie3.setId(3);
        movie3.setTitle("Filmtitel 3");
        movie3.setDescription("Virkelig, virkelig, virkelig god film. Se den!");
        movie3.setTrailerUrl("https://www.dr.dk");
        movieRepository.save(movie3);

        //Testdata for movieshows
        MovieShow movieShow1 = new MovieShow();
        movieShow1.setId(1);
        LocalDateTime startDateTime = LocalDateTime.of(2024, 4, 3, 10, 0); // For eksempel kl. 10:00 den 3. april 2024
        movieShow1.setStartTimestamp(startDateTime);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 4, 3, 12, 0); // For eksempel kl. 10:00 den 3. april 2024
        movieShow1.setEndTimeStamp(endDateTime);
        movieShow1.setMovie(movie1);
        movieShow1.setTheater(theater2);
        movieShowRepository.save(movieShow1);
    }
}
