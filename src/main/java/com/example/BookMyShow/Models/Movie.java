package com.example.BookMyShow.Models;

import com.example.BookMyShow.Enums.MovieGenre;
import com.example.BookMyShow.Enums.MovieLangauge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(unique = true, nullable = false)
    private String movieName;

    private double rating;
    private int durationInMinutes;
    @Enumerated(value = EnumType.STRING)
    private MovieGenre movieGenre;

    @Enumerated(value = EnumType.STRING)
    private MovieLangauge movieLangauge;

    public Movie() {

    }

    public Movie(int movieId, String movieName, double rating, int durationInMinutes, MovieGenre movieGenre, MovieLangauge movieLangauge) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
        this.durationInMinutes = durationInMinutes;
        this.movieGenre = movieGenre;
        this.movieLangauge = movieLangauge;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public MovieLangauge getMovieLangauge() {
        return movieLangauge;
    }

    public void setMovieLangauge(MovieLangauge movieLangauge) {
        this.movieLangauge = movieLangauge;
    }
}
