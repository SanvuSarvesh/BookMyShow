package com.example.BookMyShow.Models;

import com.example.BookMyShow.Enums.ShowType;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showId;
    private LocalDate showDate;
    private LocalTime showTime;
    @Enumerated(value = EnumType.STRING)
    private ShowType showType;

    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updatedOn;

    // show entity is child with respect to movie entity
    @ManyToOne
    @JoinColumn
    private Movie movie;

    // this line is for theater
    @ManyToOne
    @JoinColumn
    private Theater theater;

    // show is parent to ticket
    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<Tickets> listOfBookedTickets = new ArrayList<>();

    @OneToMany(mappedBy = "showSeat",cascade = CascadeType.ALL)
    private List<ShowSeat> listOfShowSeat = new ArrayList<>();
}
