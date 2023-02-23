package com.example.BookMyShow.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theater")
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theaterId;
    private String theaterName;
    private String location;

    // theater is parent to theaterSeat
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList = new ArrayList<>();

    // theater is parent to show
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    private List<Show> showList;
}
