package com.example.BookMyShow.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tickets")
@NoArgsConstructor
@Data
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double totalAmount;
    private String movieName;
    private LocalDate showDate;
    private LocalTime showTiming;
    private String theaterName;

    private String ticketId = UUID.randomUUID().toString();

    // joining to show entity
    @ManyToOne
    @JoinColumn
    private Show show;

    @ManyToOne
    @JoinColumn
    private User user;
}
