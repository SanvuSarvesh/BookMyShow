package com.example.BookMyShow.Controllers;

import com.example.BookMyShow.Models.Movie;
import com.example.BookMyShow.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    public MovieService movieService;

    @PostMapping("/add_movie")
    public ResponseEntity addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @GetMapping("/get_movie")
    public Movie getMovie(@RequestParam ("id") int id){
        return getMovie(id);
    }

}
