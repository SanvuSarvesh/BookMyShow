package com.example.BookMyShow.Services;

import com.example.BookMyShow.Models.Movie;
import com.example.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    public MovieRepository movieRepository;
    public ResponseEntity addMovie(Movie movie){
        movieRepository.save(movie);
        return new ResponseEntity<>("Movie has been added.", HttpStatus.ACCEPTED);
    }

    public Movie getMovie(int id){
        Movie movie = movieRepository.findById(id).get();
        return movie;

    }
}
