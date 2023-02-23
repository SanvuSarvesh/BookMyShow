package com.example.BookMyShow.Models;

import com.example.BookMyShow.Enums.SeatType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "showSeats")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isBooked;
    private double price;
    @Column(unique = true)
    private String seatNo;
    private SeatType seatType;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private Show show;
}
