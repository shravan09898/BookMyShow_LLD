package com.scaler.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> payments;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<ShowSeat> showSeats;
    /*
    suppose, Ticket1 bought seat1 and cancelled it
             later ticket2 bought seat1 and cancelled again
             ticket3 bought seat1 and used it

             here seat1 belongs to 3 tickets, 2 cancelled and 1 active
             so we mention ManyToMany
     */
    private Date bookedAt;
    private int amount;
}
