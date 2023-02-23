package com.example.BookMyShow.Models;

import com.example.BookMyShow.Enums.SeatType;

import javax.persistence.*;

@Entity
@Table(name = "theaterSeats")
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private String seatNo;

    @ManyToOne
    @JoinColumn
    //@JoinColumn(referencedColumnName = "name") // if we want other column as Foreign key
    // it should be unique and not null.
    private Theater theater;

}
